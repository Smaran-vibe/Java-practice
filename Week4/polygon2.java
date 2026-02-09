package Week4;

import java.util.Scanner;

class POLYGON {
    void displayinfo() {
        System.out.println("A polygon is a two dimensional shape with straight lines ");

    }

    int getPerimeter(int[] sides) {
        int perimeter = 0;

        for (int side : sides) {
            perimeter = perimeter + side;

        }
        return perimeter;
    }
}

class Quadrilateral extends POLYGON {

    void displayinfo() {
        super.displayinfo();
        System.out.println("A quadrilateral is a polygon with the four sides.");
    }

}

class polygon2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Quadrilateral q1 = new Quadrilateral();

        int quadrilateralSides[] = new int[4];

        System.out.println("Enter the 4 sides of quad: ");
        for (int i = 0; i < quadrilateralSides.length; ++i) {
            quadrilateralSides[i] = input.nextInt();
        }

        int perimeter = q1.getPerimeter(quadrilateralSides);
        System.out.println("The perimeter is: " + perimeter);

        q1.displayinfo();

        input.close();
    }
}
