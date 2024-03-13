package com.careerit.jfs.oop.interfaceexample;

import java.util.Scanner;

interface Payment {
    String pay(String toAccount, String fromAccount, double amount);
}

class CreditCardPayment implements Payment {

    @Override
    public String pay(String toAccount, String fromAccount, double amount) {
        return "Payment done " + this.getClass().getSimpleName() + "from " + fromAccount + " to " + toAccount + " with amount " + amount;
    }
}

class NetBankingPayment implements Payment {

    @Override
    public String pay(String toAccount, String fromAccount, double amount) {
        return "Payment done " + this.getClass().getSimpleName() + " from " + fromAccount + " to " + toAccount + " with amount " + amount;
    }
}

class ChequePayment implements Payment {

    @Override
    public String pay(String toAccount, String fromAccount, double amount) {
        return "Payment done " + this.getClass().getSimpleName() + " from " + fromAccount + " to " + toAccount + " with amount " + amount;

    }
}

class PaymentService {

    private Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public String payBill(String toAccount, String fromAccount, double amount) {
        return payment.pay(toAccount, fromAccount, amount);
    }

}

public class PaymentManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the payment type (CC/NB/CH):");

        String type = sc.nextLine();
        Payment payment = getPayment(type);

        PaymentService service = new PaymentService(payment);
        String response = service.payBill("12345", "67890", 1000);
        System.out.println(response);
    }

    private static Payment getPayment(String type) {
        return switch (type) {
            case "CC" -> new CreditCardPayment();
            case "NB" -> new NetBankingPayment();
            case "CH" -> new ChequePayment();
            default -> throw new IllegalArgumentException("Invalid payment type");
        };

    }
}
