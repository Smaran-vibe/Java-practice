package Week5;

import java.util.Scanner;

class Payment {
    void pay(double amount) {
        System.out.println("Processing a general payment of: " + amount);
    }
}

class CashPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + "using Cash. (No transation fee)");

    }
}

class CardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + "using card.(Processing through Bank.");

    }

}

class UPIpayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + "using UPI.(Instant UPI Payment)");
    }
}

public class Payment_system {
    public static void main(String[] args) {
        Payment myPayment;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to be paid in cash: ");
        double c = sc.nextDouble();

        myPayment = new CashPayment();
        myPayment.pay(c);

        System.out.println("Enter the amount to be paid in card: ");
        double ca = sc.nextDouble();

        myPayment = new CardPayment();
        myPayment.pay(ca);

        System.out.println("Enter the amount to be paid in UPI: ");
        double U = sc.nextDouble();

        myPayment = new UPIpayment();

        myPayment.pay(U);

        sc.close();

    }

}
