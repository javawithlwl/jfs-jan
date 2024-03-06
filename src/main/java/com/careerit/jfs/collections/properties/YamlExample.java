package com.careerit.jfs.collections.properties;

import org.yaml.snakeyaml.Yaml;

import java.util.List;

public class YamlExample {

    public static void main(String[] args) {

        Yaml yaml = new Yaml();

        TenantDetails tenantDetails = yaml.loadAs(YamlExample.class.getResourceAsStream("/tenant.yaml"), TenantDetails.class);
        List<Tenant> tenants = tenantDetails.getTenants();
        tenants.forEach(System.out::println);
    }
}
