package com.careerit.jfs.collections.properties;

import java.util.List;

public class TenantManager {

    public static void main(String[] args) {

            List<Tenant> tenants = TenantPropertiesUtil.loadAllTenants();
            System.out.println(tenants);

    }
}
