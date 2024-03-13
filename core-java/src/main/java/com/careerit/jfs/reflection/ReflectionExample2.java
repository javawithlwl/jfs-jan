package com.careerit.jfs.reflection;

import java.lang.reflect.Field;

public class ReflectionExample2 {

    public static void main(String[] args) {

            Product product = new Product();
            product.setName("Laptop");
            product.setDescription("Dell Laptop");
            product.setPrice(45000);
            product.setDiscount(5);

            Class<? extends Product> cls = product.getClass();

            Field[] fields = cls.getDeclaredFields();

            for(Field field:fields) {
                if(field.getName().equalsIgnoreCase("Discount")){
                    field.setAccessible(true);
                    try {
                        field.set(product, 10);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
         System.out.println(product);
    }


}
