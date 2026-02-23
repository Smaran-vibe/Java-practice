package Week6;

import java.util.Scanner;

abstract class shape {
    abstract void area();
}

class Circle extends shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of circle: " + result);
    }
}

class Rect_angle extends shape {

    int length;
    int breadth;

    Rect_angle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        int result = length * breadth;
        System.out.println("The area of rectangle is: " + result);
    }
}

public class abs_tract {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        double r = sc.nextDouble();

        shape s = new Circle(r);
        s.area();

        System.out.println("Enter the length of the rectangle: ");
        int l = sc.nextInt();

        System.out.println("Enter the breadth of rectangle: ");
        int b = sc.nextInt();

        s = new Rect_angle(l, b);
        s.area();

        sc.close();
    }

}
