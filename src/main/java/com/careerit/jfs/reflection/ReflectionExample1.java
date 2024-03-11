package com.careerit.jfs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample1 {

    public static void main(String[] args) {

        String obj = "Hello";

        Class<? extends String> cls = obj.getClass();


        Method[] methods = cls.getDeclaredMethods();
        for(Method m:methods) {
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(m.getParameterCount());
        }

        Constructor[] constructors = cls.getDeclaredConstructors();
        for(Constructor c:constructors) {
            System.out.println(c.getName());
            System.out.println(c.getParameterCount());
        }

        System.out.println(cls.getSuperclass());
        System.out.println(Arrays.toString(cls.getInterfaces()));

    }
}
