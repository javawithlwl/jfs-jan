package com.careerit.jfs.oop.constructor;

import java.util.ArrayList;
import java.util.List;

public class DbConnectionManager {

    public static void main(String[] args) {

        DbConnection db1 = new DbConnection("scott", "tiger", "jdbc:oracle:thin:@localhost:1521:xe");
        DbConnection db2 = new DbConnection("krish", "krish", "jdbc:oracle:thin:@localhost:1521:xe");
        DbConnection db3 = new DbConnection("manoj", "manoj", "jdbc:oracle:thin:@localhost:1521:xe");

        List<DbConnection> list = List.of(db1, db2, db3);
        List<String> usernames = new ArrayList<>();

        for (DbConnection db : list) {
            usernames.add(db.getUsername());
        }
        System.out.println(usernames);
    }

}
