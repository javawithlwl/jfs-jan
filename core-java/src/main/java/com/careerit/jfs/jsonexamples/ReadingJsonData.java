package com.careerit.jfs.jsonexamples;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
class  Product {
    private String pid;
    private String pname;
    private double price;
    private String brand;
    private int model;
}
public class ReadingJsonData {

    public static void main(String[] args) throws IOException {

            String str = """
                    {
                        "pid": "P1001",
                        "pname": "Lenovo Thinkpad",
                        "price": 95000,
                        "brand": "Lenovo",
                        "model": 2024
                    }
                    """;

        ObjectMapper mapper = new ObjectMapper();
        Product product = mapper.readValue(str, Product.class);
        System.out.println(product);
        String jsonStr = mapper.writeValueAsString(product);
        System.out.println(jsonStr);
        List<Product> products = getProducts("products.json");
        for(Product p: products){
            System.out.println(p);
        }
        // products => discount 10 % for all products and write data to another file
        List<Map<String,Object>> list = new ArrayList<>();
        for(Product p: products){
            Map<String,Object> map = mapper.convertValue(p, Map.class);
            map.put("discountPercentage",10);
            list.add(map);
        }
        String outputJson = mapper.writeValueAsString(list);
        File file = new File("discounted_products.json");
        mapper.writeValue(file,list);

    }

    public static List<Product> getProducts(String fileName){

            ObjectMapper objectMapper = new ObjectMapper();
            List<Product> list = new ArrayList<>();
            try{
                 list = objectMapper.readValue(ReadingJsonData.class.getResourceAsStream("/" + fileName),
                         new TypeReference<List<Product>>() {});

            }catch (Exception e){
                e.printStackTrace();
            }
            return list;

    }
}
