package com.careerit.jfs.oop.statickeyword;

public class Employee {

    private int empno;
    private String ename;
    private double salary;
    private String email;
    private String mobile;

    private static int count = 0;

    public Employee(int empno, String ename, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }
    public Employee(int empno, String ename, double salary, String email, String mobile) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.email = email;
        this.mobile = mobile;

    }
    {
        System.out.println("Message IIB");
        count++;
    }
    static{
        System.out.println("Message from static block");
    }
    public static void showCount() {
        System.out.println("Employee count "+count);
    }

    public static void main(String[] args) {
        Employee.showCount();
        Employee e1 = new Employee(1001, "Krish", 45000);
        Employee e2 = new Employee(1002, "Manoj", 55000, "manoj@gmail.com", "9876543210");
        Employee e3 = new Employee(1003, "John", 65000, "john@gmail.com", "9876543211");
        Employee.showCount();
    }

}
