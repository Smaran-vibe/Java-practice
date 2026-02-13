package Week5;

import java.util.Scanner;

import Week3.student1;

class m_type {
    String type;

    public m_type(String type) {
        this.type = type;
    }

    public double calculateDiscount() {

        if (type.equalsIgnoreCase("Platinum")) {
            return 30.0;
        } else if (type.equalsIgnoreCase("Gold")) {
            return 20.0;
        } else if (type.equalsIgnoreCase("Silver")) {
            return 10.0;
        } else if (type.equalsIgnoreCase("Bronze")) {
            return 5.0;
        } else {
            return 0.0;
        }

    }

    public void displayMessage() {

        double discount = calculateDiscount();

        if (discount > 0) {
            System.out.println(
                    "Congratulations on being our " + type + " member. You receive an " + discount + " % off ");
        } else {
            System.out.println("Continue with us to get more offer.");
        }

    }

}

public class membr_ship {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the member type: ");
        String mbr1 = sc.nextLine();

        m_type mbr = new m_type(mbr1);
        mbr.displayMessage();

        sc.close();
    }

}
