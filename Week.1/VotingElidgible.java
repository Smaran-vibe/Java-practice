import java.util.Scanner;
public class VotingElidgible {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age= input.nextInt();

        if (age>=18){
            System.out.println("The person can vote.");
        }else{
            System.out.println("The person can't vote.");
        }
        input.close();
    }
}
