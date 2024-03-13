package com.careerit.jfs.oop.inheritance;

class Printer {
    public void print() {
        System.out.println("Printer class print method");
    }
}

class SonyPrinter extends Printer {
    public void print() {
        System.out.println("SonyPrinter class print method");
    }
}

class HpPrinter extends Printer {
    public void print() {
        System.out.println("HpPrinter class print method");
    }

    public void print(String data) {
        System.out.println("HpPrinter class print method with data :" + data);
    }
}

class CanonPrinter extends Printer {
    public void print() {
        System.out.println("CanonPrinter class print method");
    }
}

public class TypeCastingWithReference {

    public static void main(String[] args) {

        Printer printer = getPrinter("sony");
        if(printer instanceof HpPrinter obj) {
            //HpPrinter obj = (HpPrinter) printer;
            obj.print("Hello");
        }else{
            printer.print();
        }
    }

    public static Printer getPrinter(String type) {
        if (type.equals("sony")) {
            return new SonyPrinter();
        } else if (type.equals("hp")) {
            return new HpPrinter();
        } else if (type.equals("canon")) {
            return new CanonPrinter();
        } else {
            return new Printer();
        }

    }
}

