package Week3;

import java.util.Scanner;

class NepaliStudent {
    String name;
    int age;
    String gender;

    NepaliStudent(String n, int a, String g) {
        this.name = n;
        this.age = a;
        this.gender = g;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

public class MultipleObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name = scanner.nextLine();
        System.out.println("Enter the age of the student: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
        System.out.println("Enter the gender of the student: ");
        String gender = scanner.nextLine();

        NepaliStudent student1 = new NepaliStudent(name, age, gender);
        student1.display();

        NepaliStudent student2 = new NepaliStudent(name, age, gender);
        student2.display();

        NepaliStudent student3 = new NepaliStudent(name, age, gender);
        student3.display();

        NepaliStudent student4 = new NepaliStudent(name, age, gender);
        student4.display();

        System.out.println("The name of the student is: " + student1.name + "and the age of the student is: "
                + student1.age + "and the gender of the student is: " + student1.gender);
        System.out.println("The name of the student is: " + student2.name + "and the age of the student is: "
                + student2.age + "and the gender of the student is: " + student2.gender);
        System.out.println("The name of the student is: " + student3.name + "and the age of the student is: "
                + student3.age + "and the gender of the student is: " + student3.gender);
        System.out.println("The name of the student is: " + student4.name + "and the age of the student is: "
                + student4.age + "and the gender of the student is: " + student4.gender);

        scanner.close();
    }
}
