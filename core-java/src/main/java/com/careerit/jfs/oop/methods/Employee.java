package com.careerit.jfs.oop.methods;

public class Employee {

    private final int empno;
    private final String name;
    private final double salary;

    public Employee(int empno, String name, double salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }

    public Employee incrementSalary(double amount) {
        return new Employee(empno, name, salary + amount);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Krish", 45000);
        System.out.println(emp);
        Employee emp1 = emp.incrementSalary(5000);
        System.out.println(emp1);
    }
}
