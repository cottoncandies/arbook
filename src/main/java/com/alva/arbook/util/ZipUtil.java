package com.alva.arbook.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class ZipUtil {
    public static void readZipFile(String fileName) throws Exception {
        //新建读取zip流
        ZipInputStream zip = new ZipInputStream(new FileInputStream(fileName));

        BufferedReader buf = new BufferedReader(new InputStreamReader(zip));

        //此类用于表示 ZIP 文件条目
        ZipEntry Entry;


        while ((Entry = zip.getNextEntry()) != null) {
            System.out.println(Entry.getName());

            String str;
            while ((str = buf.readLine()) != null)
                System.out.println(str + "\n");

            //关闭当前 ZIP条目并定位流以读取下一个条目
            zip.closeEntry();
        }
        //流关闭
        buf.close();
        zip.close();
    }
}

