package com.alva.arbook.controller;

import com.alva.arbook.annotation.Modify;
import com.alva.arbook.dto.TextbookDTO;
import com.alva.arbook.dto.TextbookQueryDTO;
import com.alva.arbook.service.AppKeyTService;
import com.alva.arbook.service.SysExportTService;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.util.MD5Util;
import com.alva.arbook.util.ZipUtil;
import com.alva.arbook.vo.TextbookVO;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/ApiV1")
public class SysTextbookTController {

    @Autowired
    private SysTextbookTService sysTextbookTService;

    @Autowired
    private AppKeyTService appKeyTService;

    @Autowired
    private SysExportTService sysExportTService;

    @Value("${baseExportPath}")
    private String baseExportPath;

    @Value("${baseUploadPath}")
    private String baseUploadPath;

    @Value("${tempUploadPath}")
    private String tempUploadPath;

    //根据条件查询教材(联表查询)
    @RequestMapping("/GetIndex")
    public Map GetIndex(@RequestParam("ak") String accessKey, TextbookQueryDTO textbookQueryDTO) {
        Map<String, Object> map = new HashMap<>();
        if (appKeyTService.selectByAccessKey(accessKey) != null) {
            List<TextbookVO> textbookVOS = sysTextbookTService.selectByCustom(textbookQueryDTO);
            map.put("code", 0);//查询状态
            map.put("msg", "提交成功");//消息提示
            map.put("count", sysTextbookTService.countByCustomQuery(textbookQueryDTO));//查询总数
            map.put("length", textbookVOS.size());//当前记录数
            map.put("data", textbookVOS);
        } else {
            map.put("code", -1);
            map.put("msg", "提交失败");
        }
        return map;
    }

    //@Log(description = "批量导出教材")
    @RequestMapping("/exportBookList")
    public Map exportBookList(@RequestParam(value = "bookIds[]") String[] bookIds, String directory, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        String exportPath = baseExportPath;
        //确保导出目录文件夹的唯一性
        if (sysExportTService.selectByDirectory(directory) != null) {
            map.put("msg", "导出文件名已存在,请重新设置");
        } else {
            boolean exportSuccess = sysTextbookTService.exportBookList(bookIds, directory, exportPath, session);
            if (exportSuccess) {
                map.put("msg", "教材已导出到目录" + exportPath + "/" + directory);
            } else {
                map.put("msg", "操作失败!!!请登录系统后重新操作");
            }
        }
        return map;
    }

    // 下载教材(单文件下载)
//    @RequestMapping(value = "/GetData")
//    public void getData(HttpServletResponse response, String ak, @RequestParam("id") String bookId) throws IOException {
//        //授权Key是否合法
//        if (ak != null && ak != "" && appKeyTService.selectByAccessKey(ak) != null) {
//            //下载文件的信息
//            SysTextbookT sysTextbookT = sysTextbookTService.selectByPrimaryKey(bookId);
//            String fileName = sysTextbookT.getSzCaption();// 查询文件名
//            String realPath = sysTextbookT.getSzStore();// 查询文件存放位置
//            File file = new File(realPath, fileName);
//            if (file.exists()) {
//                //下载文件
//                response.setContentType("application/octet-stream");
//                response.setHeader("content-type", "application/octet-stream");
//                response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
//                response.addHeader("Content-Length", String.valueOf(file.length()));
//                response.addHeader("File-Name", new String(fileName.getBytes("utf-8"), "ISO8859-1"));
//                ServletOutputStream outputStream = response.getOutputStream();
//                outputStream.write(FileUtils.readFileToByteArray(file));
//            }
//        }
//    }

    //@Log(description = "上传教材文件")
    @PostMapping(value = "/upload")
    public Map upload(MultipartFile file) {
        Map<String, Object> map = new HashMap<>();
        try {
            // 获取文件名
            String fileName = file.getOriginalFilename();
            // 获取文件的后缀名
            String extension = FilenameUtils.getExtension(fileName);
            // 文件重命名
            String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + extension;
            // 临时存储路径
            String path = tempUploadPath + "/" + newFileName;
            File dest = new File(path);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            // 上传临时文件
            file.transferTo(dest);

            // 计算文件MD5
            String md5 = MD5Util.getMD5(dest);
            // 文件大小
            long fileSize = file.getSize();
            //读取教材zip中的json文件
            TextbookDTO textbookDTO = (TextbookDTO) ZipUtil.readZipJsonToObject(dest, TextbookDTO.class);
            String subject = textbookDTO.getSubject();
            String grade = textbookDTO.getGrade();
            String publish = textbookDTO.getPublish();
            // 真实存储路径
            String store = baseUploadPath + "/" + subject + "/" + grade + "/" + publish + "/" + newFileName;
            File destFile = new File(store);
            if (!destFile.getParentFile().exists()) {
                destFile.getParentFile().mkdirs();
            }
            destFile.createNewFile();
            // 复制文件
            FileUtils.copyFile(dest, destFile);
            // 将数据存入数据库
            textbookDTO.setMd5(md5);
            textbookDTO.setFileSize(fileSize);
            textbookDTO.setStore(store);
            int insert = sysTextbookTService.insert(textbookDTO, destFile);
            if (insert != 0) {
                // 删除临时文件
                dest.delete();
                map.put("msg", "上传成功");
                map.put("code", 0);
            } else {
                map.put("msg", "上传失败");
                map.put("code", 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", "上传失败");
            map.put("code", 1);
        }
        return map;
    }

    // 查询年级和学段
    @GetMapping("/selectDistinctSectionAndGrade")
    public Map selectDistinctSectionAndGrade() {
        Map<String, Object> map = new HashMap<>();
        List<String> sections = sysTextbookTService.selectDistinctSection();
        List<String> grades = sysTextbookTService.selectDistinctGrade();
        map.put("sections", sections);
        map.put("grades", grades);
        return map;
    }

    @Modify(description = "删除", serviceclass = SysTextbookTService.class, handleName = "删除教材")
    @RequestMapping("/deleteBook")
    public void deleteByPrimaryKey(TextbookVO book) {
        sysTextbookTService.deleteByPrimaryKey(book.getId());
    }

    @Modify(description = "编辑", serviceclass = SysTextbookTService.class, handleName = "修改教材信息")
    @PostMapping("/editBook")
    public Map editBook(TextbookVO book) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            sysTextbookTService.editBook(book);
            map.put("msg", "修改成功");
            map.put("success", true);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
            map.put("success", false);
        }
        return map;
    }
}