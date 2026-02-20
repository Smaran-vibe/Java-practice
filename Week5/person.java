package Week5;

import java.util.Scanner;

class person {
    

    private int age;

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = input.nextInt();

        person p = new person();

        p.setAge(age);

        System.out.println("The age is: " +p.getAge());

        input.close();
    }
}
