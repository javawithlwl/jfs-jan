package com.careerit.jfs.annotations;

public class MathUtil {

        @DocInfo(author = "Krish", createdDate = "2021-07-01", description = "This method is used to calculate the EMI", version = "1.0", reviewers = {"John", "Smith"})
        public static double emiCalculator(double amount, double rate, int months){
            double r = rate / 12 / 100;
            double emi = amount * r * Math.pow(1 + r, months) / (Math.pow(1 + r, months) - 1);
            return emi;
        }

        @DocInfo(author = "Krish", createdDate = "2021-07-01", description = "This method is used to calculate the simple interest", version = "1.0", reviewers = {"John", "Smith"})
        public static double simpleInterest(double amount, double rate, int months){
            return amount * rate * months / 100;
        }

        @DocInfo(author = "Manoj", createdDate = "2021-07-01", description = "This method is used to calculate the compound interest", version = "1.0", reviewers = {"John", "Smith"})
        public static double compoundInterest(double amount, double rate, int months){
            return amount * Math.pow(1 + rate / 100, months) - amount;
        }

        @DocInfo(author = "Manoj", createdDate = "2021-07-01", description = "This method is used to calculate the factorial of given number", version = "1.0", reviewers = {"John", "Smith"})
        public static long factorial(int num){
            if(num == 0 || num == 1){
                return 1;
            }
            return num * factorial(num - 1);
        }

        @DocInfo(author = "Krish", createdDate = "2021-07-01", description = "This method is used to calculate the power of given number", version = "1.0", reviewers = {"John", "Smith"})
        public static long power(int num, int p){
            if(p == 0){
                return 1;
            }
            return num * power(num, p - 1);
        }

}
