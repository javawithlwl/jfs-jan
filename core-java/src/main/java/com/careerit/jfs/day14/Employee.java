package com.careerit.jfs.day14;

public class Employee {

    private int empno;
    private String name;
    private double salary;

    public Employee(int empno, String name, double salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int empno, String name) {
        this(empno, name, 25000.0);
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Empno   : " + empno);
        System.out.println("Name    : " + name);
        System.out.println("Salary  : " + salary);
    }
}
