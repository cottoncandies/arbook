package com.alva.arbook.controller;

import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.AppKeyTService;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.vo.TextBookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ApiV1")
public class SysTextbookTController {

    @Autowired
    private SysTextbookTService sysTextbookTService;

    @Autowired
    private AppKeyTService appKeyTService;


    //String ak,授权Key
    // String sub,学科
    // String pub,出版社
    // String s,学段：小学，初中，高中
    // String g,年级
    // int p, 页码
    // int sz 分页大小

    @RequestMapping("/GetIndex")
    @ResponseBody
    public Map GetIndex(String ak, String sub, String pub, String s, String g, int p, int sz) {

        Map<String, Object> map = new HashMap<>();

        //判断授权Key是否合法
        if (appKeyTService.selectByAccessKey(ak) != null) {
            List<TextBookVO> textBookVOList = sysTextbookTService.selectByCustom(sub, pub, s, g, p, sz);

            map.put("result", 0);
            map.put("message", "提交成功");
            map.put("total", sysTextbookTService.count(sub, pub, s, g));
            map.put("length", textBookVOList.size());
            map.put("data", textBookVOList);
        } else {
            map.put("result", -1);
            map.put("message", "提交失败");
        }
        return map;
    }

    // 单文件上传
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        try {
            if (file.isEmpty()) {
                return "文件为空";
            }
            // 获取文件名
            String fileName = file.getOriginalFilename();
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));

            // 设置文件存储路径
            String filePath = "E://wzh//";
            String path = filePath + fileName;

            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();// 新建文件夹
            }
            file.transferTo(dest);// 文件写入
            return "上传成功";
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    //文件下载相关代码
    @RequestMapping("/download")
    public String downloadFile(HttpServletRequest request, HttpServletResponse response, String ak, @RequestParam("id") String bookId) {
        //判断授权Key是否合法
        if (appKeyTService.selectByAccessKey(ak) != null) {
            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
            String fileName = sysTextbookT.getSzCaption();// 设置文件名
            if (fileName != null) {
                //设置文件路径
                String realPath = sysTextbookT.getSzStore();// 设置文件下载路径
                File file = new File(realPath, fileName);
                if (file.exists()) {
                    response.setContentType("application/octet-stream");
                    try {
                        response.addHeader("Content-Disposition", "attachment;fileName="+ URLEncoder.encode(fileName,"UTF-8"));// 设置文件名
                        response.addHeader("Content-Length", String.valueOf(file.length()));
                        response.addHeader("File-Name", URLEncoder.encode(fileName,"UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    byte[] buffer = new byte[1024];
                    FileInputStream fis = null;
                    BufferedInputStream bis = null;
                    try {
                        fis = new FileInputStream(file);
                        bis = new BufferedInputStream(fis);
                        OutputStream os = response.getOutputStream();
                        int i = bis.read(buffer);
                        while (i != -1) {
                            os.write(buffer, 0, i);
                            i = bis.read(buffer);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (bis != null) {
                            try {
                                bis.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (fis != null) {
                            try {
                                fis.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}