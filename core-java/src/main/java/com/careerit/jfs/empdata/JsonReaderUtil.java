package com.careerit.jfs.empdata;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JsonReaderUtil {

        public List<Currency> loadCurrencies(){
            ObjectMapper mapper = getObjectMapper();
            try{
                Map<String,Currency> map = mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/currencies.json"),
                        new TypeReference<Map<String, Currency>>() {});
                return map.values().stream().toList();
               }catch (Exception e){
                System.out.println("Error : "+e);
            }
            return Collections.emptyList();
        }

        public List<Employee> loadEmployees() {
            ObjectMapper mapper = getObjectMapper();
            try {
                return mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/employees.json"),
                        new TypeReference<List<Employee>>() {
                        });

            } catch (Exception e) {
                System.out.println("Error : " + e);
            }
            return Collections.emptyList();
        }

        public ObjectMapper getObjectMapper(){
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper;
        }


}
