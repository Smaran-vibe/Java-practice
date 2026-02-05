package Week4;

import java.util.Scanner;

class Employee {
    private String name;
    private String employeeID;
    private String designation;
    private double salary;

    public Employee(String name, String employeeID, String designation, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.designation = designation;
        this.salary = salary;

    }

    public void incrementSalary(double percentage) {
        
        salary += salary * (percentage / 100);
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

}

public class Employee_Payroll_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Employee ID: ");
        String employeeID = sc.nextLine();

        System.out.println("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, employeeID, designation, salary);

        System.out.println("Employee Details Before Increment: ");
        emp.displayDetails();
        emp.incrementSalary(10.0);

        System.out.println("Employee Details After Increment: ");
        emp.displayDetails();

        emp = null;
        System.gc(); // Suggests garbage collection

        sc.close();

    }

}
