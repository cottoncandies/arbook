package com.alva.arbook.util;

import com.alva.arbook.transform.JsonTextbook;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ReadFile {
    public static void main(String[] args) throws Exception {

//        try {
//            BufferedInputStream is = null;
//            ZipEntry entry;
//            ZipFile zipfile = new ZipFile("E:/wzh/下载/八年级物理下.zip", Charset.forName("gbk"));
//            Enumeration e = zipfile.entries();
//            while (e.hasMoreElements()) {
//                entry = (ZipEntry) e.nextElement();
//                if (entry.toString().endsWith("__meta.json")) {
//                    is = new BufferedInputStream
//                            (zipfile.getInputStream(entry));
//
//                    is.close();
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}

