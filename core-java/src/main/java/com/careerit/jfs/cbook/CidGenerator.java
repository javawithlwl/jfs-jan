package com.careerit.jfs.cbook;

public class CidGenerator {

    private static int count = 1001;

    public static String generateCid() {
        return "CID-"+count++;
    }

}
