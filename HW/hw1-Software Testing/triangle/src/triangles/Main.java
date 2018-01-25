package triangles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int side1,side2,side3;

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter a integer number of the first side of a triangle.");
            side1 = input.nextInt();
            System.out.println("Please enter a integer number of the second side of a triangle.");
            side2 = input.nextInt();
            System.out.println("Please enter a integer number of the third side of a triangle.");
            side3 = input.nextInt();

        input.close();

        triangle tri = new triangle(side1,side2,side3);
            if (tri.is_greaterThanZero()) {
                if (tri.is_triangle()) {
                    if (tri.is_equilateral()) {
                        System.out.println("It is an equilateral triangle.");
                    } else if (tri.is_isosceles()) {
                        System.out.println("It is an isosceles triangle.");
                    } else if (tri.is_scalene()) {
                        System.out.println("It is a scalene.");
                    }
                } else {
                    System.out.println("It is not a triangle.");
                }
            } else {
                System.out.println("All values must be > 0.");
            }
        } catch (Exception e){
            System.out.println("Invalid input.");
        }
    }
}
