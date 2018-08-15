package com.alva.arbook.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipUtil {
    public static Object readZipJsonToObject(File file, Class<? extends Object> valueType) {
        BufferedInputStream is = null;
        ZipEntry entry;
        ZipFile zipfile = null;
        try {
            zipfile = new ZipFile(file, Charset.forName("gbk"));
            Enumeration e = zipfile.entries();
            while (e.hasMoreElements()) {
                entry = (ZipEntry) e.nextElement();
                if (entry.toString().endsWith("__meta.json")) {
                    is = new BufferedInputStream(zipfile.getInputStream(entry));//获取输入流
                    //读取教材json文件内容
                    ObjectMapper objectMapper = new ObjectMapper();
                    return objectMapper.readValue(is, valueType);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (zipfile != null) {
                try {
                    zipfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

