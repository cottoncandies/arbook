package com.alva.arbook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArbookApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        // 所有异常抛出
        File file = new File("E://wzh/book/初中语文1.pdf");    // 定义要压缩的文件
        File zipFile = new File("ee.zip");    // 定义压缩文件名称
        InputStream input = new FileInputStream(file);    // 定义文件的输入流
        ZipOutputStream zipOut = null;    // 声明压缩流对象
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.putNextEntry(new ZipEntry(file.getName()));    // 设置ZipEntry对象
        zipOut.setComment("www.mldnjava.cn");    // 设置注释
        int temp = 0;
        while ((temp = input.read()) != -1) {    // 读取内容
            zipOut.write(temp);    // 压缩输出
        }
        input.close();    // 关闭输入流
        zipOut.close();    // 关闭输出流

        //读取zip文件流的大小
        ZipInputStream zipIn = null;
        try {
            zipIn = new ZipInputStream(new FileInputStream(zipFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ZipEntry zipEntry;
        while ((zipEntry = zipIn.getNextEntry()) != null) {
            zipIn.closeEntry();
            if (!zipEntry.isDirectory()) {
                String name = zipEntry.getName();
                long size = zipEntry.getSize();
                long compd = zipEntry.getCompressedSize();
                System.out.printf("%s , size=%d, compressed size=%d\r\n", name, size, compd);
            }
        }
        zipIn.close();

    }
}



