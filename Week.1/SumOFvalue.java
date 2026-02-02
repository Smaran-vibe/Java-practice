import java.util.Scanner;

public class SumOFvalue {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);




        int sum = 0;

        while(true){

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        if(number == 0){
            break;
        }
        sum = sum + number;
        System.out.println("Your sum is: " +sum);

        }
        input.close();
    }
}
