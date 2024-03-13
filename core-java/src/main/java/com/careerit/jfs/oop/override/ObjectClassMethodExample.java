package com.careerit.jfs.oop.override;

import java.util.Objects;

class Product extends Object {
    private int pid;
    private String pname;
    private double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Product {" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return pid == product.pid && Double.compare(price, product.price) == 0 && Objects.equals(pname, product.pname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pid, pname, price);
    }
}

public class ObjectClassMethodExample {

    public static void main(String[] args) {

        Product p1 = new Product(1001, "Dell Laptop", 45000);
        Product p2 = new Product(1001, "Dell Laptop", 45000);
        Product p3 = p1;

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }
}
