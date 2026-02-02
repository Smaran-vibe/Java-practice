import java.util.Scanner;
public class Multiplicationtable {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();

        int count = 1;

        while (count<=10){

        System.out.println(n+ " * " +count+ " = "+(n*count));

            count++;

        }

        input.close();
    }
}
