import java.util.Scanner;

public class EmployeeBonus {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // get input values for salary and year of service
            System.out.println("Enter the salary: ");
            double salary = input.nextDouble();

            System.out.println("Enter the service year: ");
            double serviceYear = input.nextDouble();

            // check if serviceYear is greater than 5
            if (serviceYear > 5) {


                // compute the bonus and print it
                // hint: 5% bonus is equal to (bonus * salary) / 100
                double bonus = (5 *salary) /100;
                System.out.println("Congratulations,you get the bonus of: "+bonus);
            }else{
                System.out.println("No bonus for you.Maybe later");
            }

            input.close();
        }
    }

