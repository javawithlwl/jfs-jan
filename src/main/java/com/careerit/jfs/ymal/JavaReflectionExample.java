package com.careerit.jfs.ymal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class JavaReflectionExample {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {

        Map<String,Object> map = Map.of("name","Lenovo Thinkpad","price",45000.0,"category","Laptop");

        Class clazz = String.class;
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }

        Class  cls = Product.class;
        Product p = (Product) cls.newInstance();
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);
        field.set(p,"Lenovo Thinkpad");
        System.out.println(p);


        Product product = convertMapToProduct(map,Product.class);
        System.out.println(product);

        Player player = convertMapToProduct(Map.of("name","Sachin","team","MI","role","Batsman","country","India","amount",45000),Player.class);
        System.out.println(player);

        String fileName1 = "/user.properties";
        String fileName2= "/player.properties";

        Player player1 = getProperitesToObject(fileName2,Player.class);
        System.out.println(player1);
        User user = getProperitesToObject(fileName1,User.class);
        System.out.println(user);

    }

    private  static <T> T convertMapToProduct(Map<String, Object> map, Class clazz) {
        try {
            T obj = (T) clazz.newInstance();
            map.forEach((key,value)->{
                try {
                    Field field = clazz.getDeclaredField(key);
                    field.setAccessible(true);
                    field.set(obj,value);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
            return obj;
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static <T> T getProperitesToObject(String fileName,Class<T> clazz){
        // Read the properties file and convert to Map
        return null;
    }
}
