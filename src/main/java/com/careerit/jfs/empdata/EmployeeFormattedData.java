package com.careerit.jfs.empdata;

import lombok.Data;

@Data
public class EmployeeFormattedData {
        private long id;
        private String fullName;
        private String email;
        private double salary;
        private String currencyName;
        private String formattedSalary;
}
