package com.careerit.jfs.oop.constructor;


import java.util.ArrayList;
import java.util.List;

public class AssignmentQuestion {

    public static void main(String[] args) {

        String data = """
                1001,Krish,45000
                1002,Manoj,55000
                1003,Charan,65000
                1004,Praveen,35000
                1005,Manish,65000
                1006,Rajesh,95000
                """;
        String[] lines = data.split("\n");

        // Create a class Account with fields accno, name, balance
        // Read the data and create the Account objects and store in the arraylist
        // Print the account details whose balance is greater than 50000

        List<Account> accounts = new ArrayList<>();
        for(String line:lines){
            // Split the line with comma and create the account object and store in the arraylist
        }
        // Iterate the arraylist and print the account details whose balance is greater than 50000

    }

}
