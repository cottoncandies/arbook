package com.alva.arbook.controller;

import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.AppKeyTService;
import com.alva.arbook.service.SysTextbookTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
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

    //根据条件查询教材(联表查询)
    @RequestMapping("/GetIndex")
    @ResponseBody
    public Map GetIndex(@RequestParam("ak") String accessKey, String subject, String publish, String section, String grade, @RequestParam("page") int page, @RequestParam("limit") int limit) {
        Map<String, Object> map = new HashMap<>();
        //判断授权Key是否合法
        if (appKeyTService.selectByAccessKey(accessKey) != null) {
            List<SysTextbookT> textbookTS = sysTextbookTService.selectByCustom(subject, publish, section, grade, page, limit);
            map.put("code", 0);//查询状态
            map.put("msg", "提交成功");//消息提示
            map.put("count", sysTextbookTService.countByCustomQuery(subject, publish, section, grade));//查询总数
            map.put("length", textbookTS.size());//当前记录数
            map.put("data", textbookTS);
        } else {
            map.put("code", -1);
            map.put("msg", "提交失败");
        }
        return map;
    }

    //查询所有教材(单表查询)
    @RequestMapping("/GetAll")
    @ResponseBody
    public Map GetIndex(@RequestParam("page") int p, @RequestParam("limit") int sz) {
        Map<String, Object> map = new HashMap<>();
        List<SysTextbookT> textbookTS = sysTextbookTService.selectAll(p, sz);
        map.put("code", 0);
        map.put("msg", "提交成功");
        map.put("count", sysTextbookTService.countAllTextBook());
        map.put("length", textbookTS.size());
        map.put("data", textbookTS);
        return map;
    }

    // 单文件上传
    @RequestMapping("/upload")
    @ResponseBody
    public Map upload(@RequestParam("file") MultipartFile file) {
        Map<String, Object> map = new HashMap<>();
        try {
            if (file.isEmpty()) {
                map.put("msg", "文件为空");
                return map;
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
            map.put("msg", "上传成功");
            return map;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.put("msg", "上传失败");
        return map;
    }

    //获取教材文件封面
    @RequestMapping(value = "/GetCover")
    public void getCover(HttpServletResponse res, String ak, @RequestParam("id") String bookId) {
        //1判断授权Key是否合法
        if (ak != null && ak != "" && appKeyTService.selectByAccessKey(ak) != null) {
            //2查询下载文件封面的信息
            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
            String fileCoverName = sysTextbookT.getSzCover();// 查询文件封面名
            String realPath = sysTextbookT.getSzStore();// 查询存放位置
            File file = new File(realPath, fileCoverName);
            //3判断文件是否存在
            if (file.exists()) {
                byte[] buff = new byte[1024];
                BufferedInputStream bis = null;
                OutputStream os = null;
                //4下载文件封面
                try {
                    res.setContentType("application/octet-stream");
                    res.setHeader("content-type", "application/octet-stream");
                    res.setHeader("Content-Disposition", "attachment;filename=" + new String(fileCoverName.getBytes("utf-8"), "ISO8859-1"));
                    res.addHeader("Content-Length", String.valueOf(file.length()));
                    res.addHeader("File-Name", new String(fileCoverName.getBytes("utf-8"), "ISO8859-1"));
                    os = res.getOutputStream();
                    bis = new BufferedInputStream(new FileInputStream(file));
                    int i;
                    while (-1 != (i = bis.read(buff))) {
                        os.write(buff, 0, buff.length);
                    }
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (os != null) {
                        try {
                            os.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    //获取教材文件
    @RequestMapping(value = "/GetData")
    public void getData(HttpServletResponse res, String ak, @RequestParam("id") String bookId) {
        //1判断授权Key是否合法
        if (ak != null && ak != "" && appKeyTService.selectByAccessKey(ak) != null) {
            //2查询下载文件的信息
            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
            String fileName = sysTextbookT.getSzCaption();// 查询文件名
            String realPath = sysTextbookT.getSzStore();// 查询文件存放位置
            File file = new File(realPath, fileName);
            //3判断文件是否存在
            if (file.exists()) {
                byte[] buff = new byte[1024];
                BufferedInputStream bis = null;
                OutputStream os = null;
                //4下载文件
                try {
                    res.setContentType("application/octet-stream");
                    res.setHeader("content-type", "application/octet-stream");
                    res.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
                    res.addHeader("Content-Length", String.valueOf(file.length()));
                    res.addHeader("File-Name", new String(fileName.getBytes("utf-8"), "ISO8859-1"));
                    os = res.getOutputStream();
                    bis = new BufferedInputStream(new FileInputStream(file));
                    int i;
                    while (-1 != (i = bis.read(buff))) {
                        os.write(buff, 0, buff.length);
                    }
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (os != null) {
                        try {
                            os.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}