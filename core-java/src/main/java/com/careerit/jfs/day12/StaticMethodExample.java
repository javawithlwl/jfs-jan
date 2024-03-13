package com.careerit.jfs.day12;

public class StaticMethodExample {

    public void showGreetings(String name) {
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }
        System.out.println("Hello " + name + ", Good Morning!");
    }

    public static void main(String[] args) {
        StaticMethodExample obj = new StaticMethodExample();
        obj.showGreetings("Krish");
    }

}
