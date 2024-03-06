package com.careerit.jfs.collections.properties;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TenantDetails {
        private List<Tenant> tenants;
}
