package com.careerit.jfs.day10;

public class CountOfLettersInString {

    public static void main(String[] args) {

        String str = "Hello World";

        // Count the number vowels
        int vowels = 0;
        // vowels a,e,i,o,u or A,E,I,O,U

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            vowels = switch (ch){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vowels + 1;
                default -> vowels;
            };
        }
        System.out.println("Vowels count in the string :" + vowels);

    }
}
