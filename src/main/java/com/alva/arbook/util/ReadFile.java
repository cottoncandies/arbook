package com.alva.arbook.util;

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
//            BufferedOutputStream dest = null;
//            FileInputStream fis = new
//                    FileInputStream("E:/wzh/下载/八年级物理下.zip");
//            ZipInputStream zis = new
//                    ZipInputStream(new BufferedInputStream(fis), Charset.forName("gbk"));
//            ZipEntry entry;
//            while ((entry = zis.getNextEntry()) != null) {
//                System.out.println("Extracting: " + entry);
//                if (entry.toString().endsWith("__meta.json")) {
//
//                    int count;
//                    byte data[] = new byte[2048];
//                    // write the files to the disk
//                    FileOutputStream fos = new
//                            FileOutputStream(entry.getName());
//                    dest = new
//                            BufferedOutputStream(fos, 2048);
//                    while ((count = zis.read(data, 0, 2048))
//                            != -1) {
//                        dest.write(data, 0, count);
//                    }
//                    dest.flush();
//                    dest.close();
//                }
//            }
//            zis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        try {
            BufferedOutputStream dest = null;
            BufferedInputStream is = null;
            ZipEntry entry;
            ZipFile zipfile = new ZipFile("E:/wzh/下载/八年级物理下.zip", Charset.forName("gbk"));
            Enumeration e = zipfile.entries();
            while (e.hasMoreElements()) {
                entry = (ZipEntry) e.nextElement();
                System.out.println("Extracting: " + entry);
                //if (entry.toString().endsWith("__meta.json")) {
                    is = new BufferedInputStream
                            (zipfile.getInputStream(entry));
                    int count;
                    byte data[] = new byte[2048];
                    FileOutputStream fos = new
                            FileOutputStream(entry.getName());
                    dest = new
                            BufferedOutputStream(fos, 2048);
                    while ((count = is.read(data, 0, 2048))
                            != -1) {
                        dest.write(data, 0, count);
                    }
                    dest.flush();
                    dest.close();
                    is.close();
                //}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

