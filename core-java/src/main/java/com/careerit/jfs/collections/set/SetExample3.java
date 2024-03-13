package com.careerit.jfs.collections.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Product{
    private int pid;
    private String pname;
    private double price;

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
public class SetExample3 {

    public static void main(String[] args) {

        Product p1 = new Product(1001, "Dell Laptop", 45000);
        Product p2 = new Product(1002, "HP Laptop", 35000);
        Product p3 = new Product(1001, "Dell Laptop", 45000);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        Set<Product> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set.size());

    }
}
