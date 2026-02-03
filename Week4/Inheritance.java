package Week4;


    class Student {
    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

class CollegeStudent extends Student {
    int rollNo;
    public int studentID;

    void showRollNo() {
        System.out.println(rollNo + studentID);
    }
}
class StudentID extends CollegeStudent{
    int studentID;

    void showStudentID() {
        System.out.println(studentID);
        
    }
}

public class Inheritance {
public static void main(String[] args) {
        // Create an object of the CHILD class
        CollegeStudent s1 = new CollegeStudent();

        // These variables come from the PARENT (Student)
        s1.name = "Smaran";
        s1.age = 21;
        s1.studentID = 5001;

        // This variable is unique to the CHILD (CollegeStudent)
        s1.rollNo = 101;

        // Call methods from both!
        s1.display();    // From Parent
        s1.showRollNo();
        
        System.out.println("ID: " + s1.studentID);
    }
}


