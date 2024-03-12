package com.careerit.jfs.annotations;

import java.lang.reflect.Method;

public class MathUtilReflection {


    public static void main(String[] args) {

        // Get all the methods of MathUtil class and print author names and created date

        Class<? extends MathUtil> cls = MathUtil.class;
        Method[] methods = cls.getDeclaredMethods();
        for(Method method:methods) {
            if(method.isAnnotationPresent(DocInfo.class)) {
                DocInfo docInfo = method.getAnnotation(DocInfo.class);
                System.out.println("Method Name: "+method.getName());
                System.out.println("Author: "+docInfo.author());
                System.out.println("Created Date: "+docInfo.createdDate());
                System.out.println("-".repeat(50));

            }
        }
    }
}
