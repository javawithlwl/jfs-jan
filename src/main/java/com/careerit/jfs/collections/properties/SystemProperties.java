package com.careerit.jfs.collections.properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {

    public static void main(String[] args) {

        Properties properties = System.getProperties();

        properties.forEach((key,value)->{
            System.out.println(key+" : "+value);
        });

        String dirName = properties.getProperty("java.io.tmpdir");
        System.out.println("Temp dir : "+dirName);

        String fileName = dirName+"/temp.txt";
        File file = new File(fileName);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write("Hello world");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
