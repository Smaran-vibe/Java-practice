package Week3;

public class student1 {

    String name;
    int age;

    student1(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class TestStudent {
    public static void main(String[] args) {

         student1 s1 = new student1("Mohan Tandulkar", 25);
         s1.display();
        // new student1("Ram", 20).display(); 
    }
}
 
