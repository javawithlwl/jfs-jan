package com.careerit.jfs.collections.properties;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TenantPropertiesUtil {

        public static Tenant loadTenantDetails() {
            Properties properties = new Properties();
            try {
                properties.load(TenantPropertiesUtil.class.getResourceAsStream("/tenant.properties"));
            }catch (Exception e) {
                System.out.println("Error while loading tenant properties"+e);
            }
            Tenant tenant = new Tenant();
            tenant.setName(properties.getProperty("tenant.name"));
            tenant.setEmail(properties.getProperty("tenant.email"));
            tenant.setCity(properties.getProperty("tenant.city"));
            return tenant;
        }

        public static List<Tenant> loadAllTenants(){
            Properties properties = new Properties();
            List<Tenant> list = new ArrayList<>();
            try {
                properties.load(TenantPropertiesUtil.class.getResourceAsStream("/tenant.properties"));
                for(int i=0;i<=1;i++){
                    Tenant tenant = new Tenant();
                    tenant.setName(properties.getProperty("tenant["+i+"].name"));
                    tenant.setEmail(properties.getProperty("tenant["+i+"].email"));
                    tenant.setCity(properties.getProperty("tenant["+i+"].city"));
                    list.add(tenant);
                }

            }catch (Exception e) {
                System.out.println("Error while loading tenant properties"+e);
            }
            return list;
        }
}
