package com.careerit.jfs.reflection;

import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.util.Map;

public class ReflectionExample3 {


    public static void main(String[] args) {
         Product product = new Product("Laptop","Dell Laptop",45000,5);
         Transaction transaction = new Transaction("T1001","9876543210","8907654321",450,Status.PENDING);

         Map<String,Object> productUpdateMap = Map.of("description","Dell Laptop 15.6 inch","discount",10);
         Product updatedProduct = update(productUpdateMap,product);
         System.out.println(updatedProduct);
         // change description and discount to 10
        // update the status to SUCCESS

        Map<String,Object> transactionUpdateMap = Map.of("status",Status.SUCCESS);
        Transaction updatedTransaction = update(transactionUpdateMap,transaction);
        System.out.println(updatedTransaction);
        Map<String,Object> countryInfoMap = Map.of("name","India","population",1350000000,"currency","INR");
        CountryInfo country = create(countryInfoMap,CountryInfo.class);
        System.out.println(country);
    }
    public static <T> T update(Map<String,Object> map, T obj) {
        Class<? extends Object> cls = obj.getClass();
        for (Field field : cls.getDeclaredFields()) {
                 if(map.containsKey(field.getName())) {
                     try {
                         FieldUtils.writeField(obj, field.getName(), map.get(field.getName()), true);
                     } catch (IllegalAccessException e) {
                         throw new RuntimeException(e);
                     }
                 }
        }
        return obj;
    }

    public static <T> T create(Map<String,Object> map, Class<T> clazz) {
        T obj = null;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                if(map.containsKey(field.getName())) {
                    FieldUtils.writeField(obj, field.getName(), map.get(field.getName()), true);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return obj;

    }
}
