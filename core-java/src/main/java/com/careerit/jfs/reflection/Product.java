package com.careerit.jfs.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

        private String name;
        private String description;
        private double price;
        private double discount;

        @Override
        public String toString(){
            return "Name: "+name+" Description: "+description+" Price: "+price+" Discount: "+discount;
        }
}
