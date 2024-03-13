package com.careerit.jfs.day11;

public class Employee {

    private int empno;
    private String ename;
    private double salary;
    private String location;

    public Employee(int empno, String ename, double salary, String location) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.location = location;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
