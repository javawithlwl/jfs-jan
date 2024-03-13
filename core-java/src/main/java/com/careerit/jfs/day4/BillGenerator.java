package com.careerit.jfs.day4;

// Accept bill amount and day of the week; if day is Monday or Tuesday or Wednesday or Thursday then
// apply 30% discount on bill amount, if day is Friday 10% and if day is Saturday or Sunday then 30% extra
public class BillGenerator {

    public static void main(String[] args) {
        double billAmount = 1000;
        String day = "Monday";
        double netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount : " + billAmount + " Day : " + day + " Net Amount : " + netAmount);
        day = "Friday";
        netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount : " + billAmount + " Day : " + day + " Net Amount : " + netAmount);
        day = "Saturday";
        netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount : " + billAmount + " Day : " + day + " Net Amount : " + netAmount);
        day = "Sunday";
        netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount : " + billAmount + " Day : " + day + " Net Amount : " + netAmount);
    }

        public static double netAmount(double billAmount, String day) {
            if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")) {
                return billAmount - billAmount * 0.3;
            }else if(day.equals("Friday")) {
                return billAmount - billAmount * 0.1;
            }else if(day.equals("Saturday") || day.equals("Sunday")) {
                return billAmount + billAmount * 0.3;
            }else {
                return billAmount;
            }
        }
}
