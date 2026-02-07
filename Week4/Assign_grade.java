package Week4;

import java.util.Scanner;

class stdent {
    
    int score;
    char grade;
    
   
    stdent(int score) {
        this.score = score;
    }
    
    void assignGrade() {
        
        if (this.score >= 90) {
            this.grade = 'A';
        }
        else if (this.score >= 80) {
            this.grade = 'B';
        }
        else {
            this.grade = 'C';
        }
    }
}

public class Assign_grade {
        public static void main(String[] args) {
        
        // take the score input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the student's score: ");
        int score = input.nextInt();
        
        // create object
        stdent student = new stdent(score);
        
        // call the assignGrade() method
        student.assignGrade();
        
        // print the grade
        System.out.println("The student's grade is: " + student.grade);
    }
}

