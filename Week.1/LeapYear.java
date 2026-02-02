import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        if ( year%400==0) {
            System.out.println("This is leap year.");

            }else if(year%100==0){
            System.out.println("This is not a leap year.");
        }
        else if (year%4==0) {
            System.out.println("This is leap year.");

        }else{
            System.out.println("This is not a leap year.");
        }

        input.close();
    }
}
