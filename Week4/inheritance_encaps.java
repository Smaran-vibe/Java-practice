package Week4;

import java.util.Scanner;

class Chattra {
    private String name;
    private int age;

    public void setName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    void display() {
        System.out.println("The name is:" + name);
        System.out.println("The age is: " + age);
    }
}

class University_Vidhyarthi extends Chattra {
    private int rollNo;
    public int studentID;

    public void setRollNo(int rollNo, int studentID) {
        this.rollNo = rollNo;
        this.studentID = studentID;

    }

    public int getRollNo() {
        return rollNo;
    }

    public int getStudentID() {
        return studentID;
    }

    void showRollNo() {
        System.out.println("The roll number is: " + rollNo);
        System.out.println("The Student ID is: " + studentID);
    }

}

public class inheritance_encaps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        University_Vidhyarthi uv = new University_Vidhyarthi();

        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();

        uv.setName(name, age);
        uv.display();
        System.out.println("Enter roll number: ");
        int rollNO = input.nextInt();

        System.out.println("Enter student ID: ");
        int studentID = input.nextInt();

        uv.setRollNo(rollNO, studentID);
        uv.showRollNo();

        System.out.println("The name is: " + uv.getName() + " age is: " + uv.getAge() + " and the roll no is: "
                + uv.getRollNo() + " and the student ID is " + uv.getStudentID());
        ;

        input.close();
    }

}
