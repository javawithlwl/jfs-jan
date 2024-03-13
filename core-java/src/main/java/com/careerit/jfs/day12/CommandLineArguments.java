package com.careerit.jfs.day12;

public class CommandLineArguments {

    public static void main(String[] args) {

        System.out.println("The number of arguments passed : "+args.length);

        int empno = Integer.parseInt(args[0]);
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        String city = args[3];
        double salary = Double.parseDouble(args[4]);

        System.out.println("Empno : "+empno);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("City : "+city);
        System.out.println("Salary : "+salary);
    }

    // public, protected, default, private
}
