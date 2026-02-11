package Week3;
import java.util.Scanner;

public class calculator {

   int add (int a ,int b){
    return a+b;
   }
   int subtract (int a,int b){
    return a-b;
   }
}
class TestCalculator {
    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the values of two numbers: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        int sum = calc.add(a, b);
        int difference = calc.subtract(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        scanner.close();
    }
}

    
    

