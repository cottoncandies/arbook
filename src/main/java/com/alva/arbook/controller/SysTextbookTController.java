package com.alva.arbook.controller;

import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.AppKeyTService;
import com.alva.arbook.service.SysTextbookTService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/ApiV1")
public class SysTextbookTController {

    @Autowired
    private SysTextbookTService sysTextbookTService;

    @Autowired
    private AppKeyTService appKeyTService;

    @Value("${baseExportPath}")
    private String baseExportPath;

    @Value("${baseUploadPath}")
    private String baseUploadPath;

    //根据条件查询教材(联表查询)
    @RequestMapping("/GetIndex")
    public Map GetIndex(@RequestParam("ak") String accessKey,
                        String subject,
                        String publish,
                        String section,
                        String grade,
                        @RequestParam("page") int page,
                        @RequestParam("limit") int limit) {
        Map<String, Object> map = new HashMap<>();
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

    @RequestMapping("/exportBookList")
    public Map exportBookList(@RequestParam(value = "bookIds[]") String[] bookIds,
                              String directory) throws IOException {
        Map<String, Object> map = new HashMap<>();
        //确保导出目录文件夹的唯一性
        String exportPath = baseExportPath;
        File exportFile = new File(exportPath);
        //创建导出目录文件夹
        if (!exportFile.exists()) {
            exportFile.mkdirs();
        }
        //遍历导出
        for (String bookId : bookIds) {
            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
            String fileName = sysTextbookT.getSzCaption();// 查询教材文件名
            String realPath = sysTextbookT.getSzStore();// 查询教材存放位置
            File file = new File(realPath, fileName);
            if (file.exists()) {
                File desFile = new File(exportPath + "/" + fileName);
                FileUtils.copyFile(file, desFile);
            } else {
                map.put("export", "文件" + fileName + "不存在");
            }
        }
        map.put("msg", "教材已导出到目录" + exportPath);
        return map;
    }

    // 单文件上传
    @PostMapping(value = "/upload")
    public Map upload(@RequestParam("file") MultipartFile file) {
        /*
        文件上传做md5
        uuid防止上传文件重名
        文件大小
        原文件名
        将信息存入数据库
        */


//        "id": "5ab9ee053db2b526f810a1bd",
//                "cover":"0000.jpg",
//                "caption": "八年级物理下",
//                "edition": "2013版",
//                "section": "初中",
//                "grade": "八年级",
//                "subject": "物理",
//                "term": "下学期",
//                "publish": "人民教育出版社",
        //读取教材文件中的json文件获取上面的属性
        Map<String, Object> map = new HashMap<>();
        try {
            String fileName = file.getOriginalFilename();// 获取文件名
            String extension = FilenameUtils.getExtension(fileName);// 获取文件的后缀名
            String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + extension;//文件重命名
            String path = baseUploadPath + "/" + newFileName;
            File dest = new File(path);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();// 新建文件夹
            }
            file.transferTo(dest);// 文件写入

            SysTextbookT textbook = new SysTextbookT("aaaaazzzzzzz","yuwen","000.jpg","diyiban",
                    "xioaxue","sannianji",1,"1","1",
                    path,"md5",file.getSize());
            sysTextbookTService.insert(textbook);
            map.put("msg", "上传成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", "上传失败");
        }
        return map;
    }

    //获取教材
    @RequestMapping(value = "/GetData")
    public void getData(HttpServletResponse response, String ak, @RequestParam("id") String bookId) throws IOException {
        //授权Key是否合法
        if (ak != null && ak != "" && appKeyTService.selectByAccessKey(ak) != null) {
            //下载文件的信息
            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
            String fileName = sysTextbookT.getSzCaption();// 查询文件名
            String realPath = sysTextbookT.getSzStore();// 查询文件存放位置
            File file = new File(realPath, fileName);
            if (file.exists()) {
                //下载文件
                response.setContentType("application/octet-stream");
                response.setHeader("content-type", "application/octet-stream");
                response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
                response.addHeader("Content-Length", String.valueOf(file.length()));
                response.addHeader("File-Name", new String(fileName.getBytes("utf-8"), "ISO8859-1"));
                ServletOutputStream outputStream = response.getOutputStream();
                outputStream.write(FileUtils.readFileToByteArray(file));
            }
        }
    }
}