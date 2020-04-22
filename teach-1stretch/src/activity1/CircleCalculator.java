package activity1;

import java.util.Scanner;


public class CircleCalculator {

    public static void main(String[] args) {
        double radius = Double.parseDouble(getRadius());
        displayCircumference(radius);
        displayArea(radius);

    }

    private static String getRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius");
        String input = String.valueOf(scanner.nextDouble());
        System.out.println(input);
        return input;
    }

    private static void displayCircumference(double radius) {
        double circumference = 3.14159 * radius * 2;
        System.out.print(circumference);
    }
    private static void displayArea(double radius) {
        double area = 3.14159 * (radius *radius);
        System.out.print(area);
    }
}
