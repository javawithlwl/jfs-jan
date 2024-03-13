package com.careerit.jfs.generics;


import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericMethodExample {

    public static void main(String[] args) {
        String playerFile = "/player_data.json";
        String productFile = "/product_data.json";
        String employeeFile = "/employee_data.json";

        Player player = getData(playerFile, Player.class);
        Product product = getData(productFile,Product.class);
        Employee employee = getData(employeeFile,Employee.class);
        System.out.println(player);
        System.out.println(product);
        System.out.println(employee);
    }

    private static <T> T getData(String file, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        T obj = null;
        try {
            obj = mapper.readValue(GenericMethodExample.class.getResourceAsStream(file), clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

/*    private static Product getProductData(String productFile) {
        ObjectMapper mapper = new ObjectMapper();
        Product product = null;
        try {
            product = mapper.readValue(GenericMethodExample.class.getResourceAsStream(productFile), Product.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    private static Player getPlayerData(String playerFile) {
        ObjectMapper mapper = new ObjectMapper();
        Player player = null;
        try {
            player = mapper.readValue(GenericMethodExample.class.getResourceAsStream(playerFile), Player.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return player;
    }
    private static Employee getEmployeeData(String employeeFile) {
        ObjectMapper mapper = new ObjectMapper();
        Employee employee = null;
        try {
            employee = mapper.readValue(GenericMethodExample.class.getResourceAsStream(employeeFile), Employee.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employee;
    }*/
}
