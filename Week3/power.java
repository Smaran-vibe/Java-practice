package Week3;

import java.util.Scanner;
public class power {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Enter the number: ");
    double number = input.nextDouble();

    System.out.println("Enter the power: ");
    double power = input.nextDouble();

    double result = 1;

    for (int i = 1; i<= power; ++i){
        result = result*number;
    }
    System.out.println("The result is: "+ result);
    input.close();
}    
}
