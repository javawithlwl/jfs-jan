package com.careerit.jfs.oop.constructor;

public class Product {

    private int pid;
    private String pname;
    private double price;

    public Product() {
        System.out.println("Product object created");
    }

    public Product(int pid, String pname) {
        this(pid, pname, 10);
        System.out.println("Product object created with pid and pname");
    }
    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        System.out.println("Product object created with pid,pname and price");
    }
    public void showDetails() {
        System.out.println("Pid   :" + pid);
        System.out.println("Pname :" + pname);
        System.out.println("Price :" + price);
    }
    public static void main(String[] args) {

        Product p1 = new Product(1001, "MacPro");
        p1.showDetails();


    }
}
