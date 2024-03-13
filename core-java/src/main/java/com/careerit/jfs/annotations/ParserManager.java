package com.careerit.jfs.annotations;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

public class ParserManager {


    public static void main(String[] args) {
        ParserManager obj = new ParserManager();
        obj.parseData();
    }

    public void parseData() {
        // get all the classes which annotated with Parser annotation and call the parse method

        String packageName = "com.careerit.jfs.annotations";

        // get all the classes from the package name

        Set<Class> classes = findAllClassesUsingClassLoader(packageName);

        for (Class clazz : classes) {
            if (clazz.isAnnotationPresent(Parser.class)) {
               try {
                    clazz.getMethod("parse").invoke(clazz.newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public Set<Class> findAllClassesUsingClassLoader(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .collect(Collectors.toSet());
    }

    private Class getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "."
                    + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            // handle the exception
        }
        return null;
    }


}
