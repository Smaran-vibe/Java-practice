package Week5;

import java.util.Scanner;

class Area {

    private double radius;

    public void setRadius(double radius) {

        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius is negative");
        }
    }

    public double getRadius() {
        return this.radius;
    }
}

class rad_of_circle {

    public static void main(String[] args) {

        Area area = new Area();

        System.out.println("Enter the value of radius:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        area.setRadius(radius);

        double circleArea = 3.14 * area.getRadius() * area.getRadius();
        System.out.println("Area of Circle: " + circleArea);

        input.close();
    }
}
