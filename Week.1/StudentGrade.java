import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the grade of the student: ");
        double grade = input.nextDouble();

        if (grade>100 || grade<0){
            System.out.println("Please enter the valid grade.");

        }else if (grade >=90){
            System.out.println("Congratulations you got an A");
        }

        else if (grade>=80) {
            System.out.println("You got a B");

        }

        else if (grade>=70) {
            System.out.println("You got a C");

        }

        else {
            System.out.println("You got a D");
        }

        input.close();

    }
}
