package com.careerit.sjdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ProductDao {


    private final JdbcTemplate jdbcTemplate;

    public ProductDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void showProducts(){
        List<Map<String,Object>> resultMap =
                jdbcTemplate.queryForList("select id,name,price from product");
        for(Map<String,Object> map : resultMap){
            System.out.println(map.get("id")+" "+map.get("name")+" "+map.get("price"));
        }
    }

    public void showProductCount(){
        int count = jdbcTemplate.queryForObject("select count(*) from product",Integer.class);
        System.out.println("Total products : "+count);
    }
}
