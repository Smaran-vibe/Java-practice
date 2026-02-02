import java.util.Scanner;
public class sumOfNaturalno {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the natural numbers: ");
        int n = input.nextInt();

         int sum = 0;

         for(int i=1;i<=n;i++){

             sum = sum+i;

         }
         System.out.println("The sum of natural number is: "+sum);
        input.close();
    }
}
