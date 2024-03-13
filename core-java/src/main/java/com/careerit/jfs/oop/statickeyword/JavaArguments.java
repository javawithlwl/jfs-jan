package com.careerit.jfs.oop.statickeyword;

import java.util.List;

class LoginUser{
    private String username;
    private String password;
    public LoginUser(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class JavaArguments {

    public static void main(String[] args) {

        List<LoginUser> list = List.of(new LoginUser("admin", "admin@123"),
                new LoginUser("user", "user@123"));

        if(args.length == 0){
            System.out.println("Please provide username and password");
            return;
        }else{
            String username = args[0];
            String password = args[1];
            boolean isUserExist = list.stream()
                    .anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
            if(isUserExist){
                System.out.println("Welcome "+username);
            }else{
                System.out.println("Invalid username or password");
            }
        }

    }
}
