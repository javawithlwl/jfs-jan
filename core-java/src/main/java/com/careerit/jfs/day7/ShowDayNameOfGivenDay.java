package com.careerit.jfs.day7;

public class ShowDayNameOfGivenDay {


    public static void main(String[] args) {

        int day = 3;
        String res = getDayName(day);
        System.out.println("The day name for "+day+" is "+res);

    }

    public String getDayNameUsingSwitchExp(int day){
        return switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

    }
    public static String getDayName(int day){
        String res = "";
        switch(day){
            case 1:
                res = "Monday";
                break;
            case 2:
                res = "Tuesday";
                break;
            case 3:
                res = "Wednesday";
                break;
            case 4:
                res = "Thursday";
                break;
            case 5:
                res = "Friday";
                break;
            case 6:
                res = "Saturday";
                break;
            case 7:
                res = "Sunday";
                break;
            default:
                res = "Invalid day";
        }
        return res;
    }
}
