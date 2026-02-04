package Week4;


class Student {
    private String name;
    private int age;
    private int rollNo;

    // Default constructor
    public Student() {
        name = "unknown";
        age = 0;
        rollNo = 0;
    }

    // Parameterized constructor
    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
       
    }
}

public class studInfo {
    public static void main(String[] args) {

        // 1. Default constructor
        Student s1 = new Student();
        s1.display();

        // 2. Parameterized constructor (Amit, 101)
        Student s2 = new Student("Amit", 20, 101);
        s2.display();

        // 3. Using setters on first student
        s1.setName("Sita");
        s1.setRollNo(5);
        s1.display();

        // 4. Another student (your name)
        Student s3 = new Student("Luffy", 19, 11);
        s3.display();

        
        // System.out.println(s1.name);   
        // System.out.println(s1.rollNo); // 
    }
}

