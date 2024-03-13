package com.careerit.jfs.oop.constructor;

public class MyMathOperations {

        private int num1;
        private int num2;
        private double num3;
        private double num4;

        public MyMathOperations(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        public MyMathOperations(double num3, double num4) {
            this.num3 = num3;
            this.num4 = num4;
        }
        public MyMathOperations(int num1,double num2){
            this.num1 = num1;
            this.num3 = num2;
        }
        public MyMathOperations(double num1,int num2){
            this.num3 = num1;
            this.num2 = num2;
        }
        public MyMathOperations(int num1, double num2,double num3){
            this.num1 = num1;
            this.num3 = num2;
        }

        // Constructor overloading
        // 1. Number of parameters should be different
        // 2. Type of parameters should be different
        // 3. Order of parameters should be different
}
