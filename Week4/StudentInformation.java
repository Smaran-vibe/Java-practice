package Week4;

import java.util.Scanner;

class std {
    private String name;
    private int age;
    private int rollNo;
    
    public std(String name, int age, int rollNo){
        this.name  = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    
    public std() {
        this.name = "unknown";
        this.age = 0;
        this.rollNo = 0;

    }

    public void setName(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative");
        }
    }

    public void setRollNo(int rollNo) {
        if (rollNo < 0) {
            System.out.println("Error: Roll Number cannot be negative.");
        } else {
            this.rollNo = rollNo;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void displayInformation() {
        System.out.println("The Name is: " + name);
        System.out.println("The Age is: " + age);
        System.out.println("The Roll Number is: " + rollNo);
    }
}

public class StudentInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        std STD = new std();

        System.out.println("Enter the student name: ");
        String name = sc.nextLine();

        System.out.println("Enter the student age: ");
        int age = sc.nextInt();

        System.out.println("Enter the student roll number: ");
        int rollNo = sc.nextInt();

        STD.setName(name, age, rollNo);

        STD.displayInformation();

        sc.close();
    }
}
