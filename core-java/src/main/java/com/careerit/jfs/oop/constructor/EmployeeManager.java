package com.careerit.jfs.oop.constructor;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Krish", 45000);
        Employee e2 = new Employee(1002, "Manoj", 55000, "IT", "9876543210", "manoj@gmail.com");

        e1.showDetails();
        e2.showDetails();
    }
}
