package Week5;

import java.util.Scanner;

class Kaamdaar {

    double calculateSalary() {

        return 0;
    }
}

class Fulltime_Employee extends Kaamdaar {

    double monthlySalary;

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartimeEmployee extends Kaamdaar {

    int hoursWorked;
    double RateperHour;

    @Override
    double calculateSalary() {
        return hoursWorked * RateperHour;
    }
}

public class Sal_Ary_system {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Kaamdaar K;

        System.out.println("Enter the monthly salary: ");
        double ms = sc.nextDouble();

        Fulltime_Employee ft = new Fulltime_Employee();
        ft.monthlySalary = ms;

        K = ft;
        System.out.println("Full time salary is= " + K.calculateSalary());

        System.out.println("Enter hours worked: ");
        int h = sc.nextInt();

        System.out.println("Enter rate per hour: ");
        int r = sc.nextInt();

        PartimeEmployee pt = new PartimeEmployee();
        pt.hoursWorked = h;
        pt.RateperHour = r;

        K = pt;

        System.out.println("Part Time Employee: " + K.calculateSalary());

        sc.close();

    }
}
