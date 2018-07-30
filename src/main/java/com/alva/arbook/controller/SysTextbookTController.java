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

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Controller
@RequestMapping("/ApiV1")
public class SysTextbookTController {

    @Autowired
    private SysTextbookTService sysTextbookTService;

    @Autowired
    private AppKeyTService appKeyTService;


    @RequestMapping("/demo")
    public String demo() {
        return "/userdemo.html";
    }

    @RequestMapping("/GetIndex")
    @ResponseBody
    public Map GetIndex(@RequestParam("ak") String accessKey, String subject, String publish, String section, String grade, @RequestParam("page") int page, @RequestParam("limit") int limit) {

        Map<String, Object> map = new HashMap<>();

        //判断授权Key是否合法
        if (appKeyTService.selectByAccessKey(accessKey) != null) {
            List<TextBookVO> textBookVOList = sysTextbookTService.selectByCustom(subject, publish, section, grade, page, limit);

            map.put("code", 0);//查询状态
            map.put("msg", "提交成功");//消息提示
            map.put("count", sysTextbookTService.countByCustomQuery(subject, publish, section, grade));//查询总数
            //map.put("length", textBookVOList.size());//当前记录数
            map.put("data", textBookVOList);
        } else {
            map.put("code", -1);
            map.put("msg", "提交失败");
        }
        return map;
    }

    @RequestMapping("/GetAll")
    @ResponseBody
    public Map GetIndex(@RequestParam("page") int p, @RequestParam("limit") int sz) {

        Map<String, Object> map = new HashMap<>();

        //判断授权Key是否合法
        List<TextBookVO> textBookVOList = sysTextbookTService.selectAll(p, sz);

        map.put("code", 0);
        map.put("msg", "提交成功");
        map.put("count", sysTextbookTService.countAllTextBook());
        //map.put("length", textBookVOList.size());
        map.put("data", textBookVOList);

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

    @RequestMapping("/GetData")
    @ResponseBody
    public Map getData(HttpServletResponse response, String ak, @RequestParam("id") String bookId) throws Exception {
        Map<String, Object> map = new HashMap<>();
        //判断授权Key是否合法
        if (appKeyTService.selectByAccessKey(ak) != null) {

            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
            String fileName = sysTextbookT.getSzCaption();// 查询文件名

            if (fileName != null) {
                //设置文件路径
                String realPath = sysTextbookT.getSzStore();// 查询文件的存放路径
                File file = new File(realPath, fileName);
                if (file.exists()) {

                    ZipOutputStream zipOut = null;    // 声明压缩流对象
                    InputStream input = null;
                    try {
                        //以下注释的两行内容会影响文件以zip格式下载
                        //response.setContentType("application/zip");
                        //response.addHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));// 设置文件名

                        response.addHeader("File-Name", URLEncoder.encode(fileName, "UTF-8"));
                        //response.setHeader("Content-Length", String.valueOf(file.length()));
                        input = new FileInputStream(file);    // 定义文件的输入流
                        OutputStream outputStream = response.getOutputStream();
                        zipOut = new ZipOutputStream(outputStream);
                        zipOut.putNextEntry(new ZipEntry(file.getName()));    // 设置ZipEntry对象

                        int temp = 0;
                        while ((temp = input.read()) != -1) {    // 读取内容
                            zipOut.write(temp);    // 压缩输出
                        }
                        map.put("msg", "success");
                        return map;
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (input != null) {
                            try {
                                input.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (zipOut != null) {
                            try {
                                zipOut.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        map.put("msg", "fail");
        return map;
    }


    @RequestMapping("/GetCover")
    @ResponseBody
    public Map getCover(HttpServletResponse response, String ak, @RequestParam("id") String bookId) throws Exception {
        Map<String, Object> map = new HashMap<>();
        //判断授权Key是否合法
        if (appKeyTService.selectByAccessKey(ak) != null) {

            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
            String fileCoverName = sysTextbookT.getSzCover();// 查询教材封面名

            if (fileCoverName != null) {
                //设置文件路径
                String realPath = sysTextbookT.getSzStore();// 查询文件的存放路径
                File file = new File(realPath, fileCoverName);
                if (file.exists()) {

                    ZipOutputStream zipOut = null;    // 声明压缩流对象
                    InputStream input = null;
                    try {
                        response.addHeader("File-Name", URLEncoder.encode(fileCoverName, "UTF-8"));
                        //response.setHeader("Content-Length", String.valueOf(file.length()));

                        input = new FileInputStream(file);    // 定义文件的输入流
                        OutputStream outputStream = response.getOutputStream();
                        zipOut = new ZipOutputStream(outputStream);
                        zipOut.putNextEntry(new ZipEntry(file.getName()));    // 设置ZipEntry对象

                        int temp = 0;
                        while ((temp = input.read()) != -1) {    // 读取内容
                            zipOut.write(temp);    // 压缩输出
                        }
                        map.put("msg", "success");
                        return map;
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (input != null) {
                            try {
                                input.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (zipOut != null) {
                            try {
                                zipOut.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        map.put("msg", "fail");
        return map;
    }
}