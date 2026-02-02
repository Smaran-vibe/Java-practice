package Week4;


class student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Error: Age cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class encapsulation { 

    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Alice");
        s1.setAge(20);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        student s2 = new student();
        s2.setName("Bob");
        s2.setAge(-5); 
        System.out.println("Name: " + s2.getName());
        System.out.println("Age: " + s2.getAge());
    }
}

/*What is the name of the class that stores student data?
 The name of the class is "student" 
 
 Which two variables are private in the Student class?
 the two private variable are name and age
 
 Why are name and age declared as private?
 The name and age variable are declared as private to encapsulate the data and prevent direct access from outside the class.
 
 Which method is used to set the name?
 The method used to set the name is `setName(String n).
 
 Which method is used to get the age?
 The method used to get the age is `getAge().
 
 What is encapsulation in simple words?
 Encapsulation is the practice of hiding internal details of a class and only exposing necessary methods to interact with the data.
 
 Why can we not write
 s1.age = 20;
 in the main() method?
 We cannot write s1.age = 20; because age is a private variable in the Student class, and private variables cannot be accessed directly from outside the class.
 
 What is the role of setter methods?
 The role of setter methods is to provide controlled access to private variables,allowing them to be modified safely and maintaining data.
 
 

What is the role of getter methods?
The role of getter methods is to provide controlled access to private variables, allowing them to be read safely without exposing internal details of the class.

*/