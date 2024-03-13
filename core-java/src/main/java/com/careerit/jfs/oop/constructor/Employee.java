package com.careerit.jfs.oop.constructor;

public class Employee {

    private int empno;
    private String ename;
    private double salary;
    private String dept;

    private String mobile;
    private String email;

    public Employee(int empno, String ename, double salary) {
        this(empno, ename, salary, "N/A");
    }
    public Employee(int empno, String ename, double salary, String dept) {
        this(empno, ename, salary, dept, "N/A", "N/A");
    }
    public Employee(int empno, String ename, double salary, String dept, String mobile, String email) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.dept = dept;
        this.mobile = mobile;
        this.email = email;
    }
    public void showDetails() {
        System.out.println("Empno :"+empno);
        System.out.println("Ename :"+ename);
        System.out.println("Salary :"+salary);
        System.out.println("Dept :"+dept);
        System.out.println("Mobile :"+mobile);
        System.out.println("Email :"+email);
    }


}
