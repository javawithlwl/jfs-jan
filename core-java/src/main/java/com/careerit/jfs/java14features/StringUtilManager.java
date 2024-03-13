package com.careerit.jfs.java14features;


import org.apache.commons.lang3.StringUtils;

public class StringUtilManager {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(StringUtils.reverse(str));
        System.out.println(StringUtils.countMatches(str, 'l'));
    }
}
