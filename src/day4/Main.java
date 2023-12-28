package day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an instance of the Shape class
        Shape1 shape1 = new Shape1();

        // Calling methods to find the area of different shapes
        System.out.println("Enter radius of the circle: ");
        double circleRadius = sc.nextDouble();
        System.out.println("Area of the Circle: " + shape1.calculateCircleArea(circleRadius));

        System.out.println("Enter side of the square: ");
        double squareSide = sc.nextDouble();
        System.out.println("Area of the Square: " + shape1.calculateSquareArea(squareSide));

        System.out.println("Enter length of the rectangle: ");
        double rectangleLength = sc.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double rectangleWidth = sc.nextDouble();
        System.out.println("Area of the Rectangle: " + shape1.calculateRectangleArea(rectangleLength, rectangleWidth));

        System.out.println("Enter base of the triangle: ");
        double triangleBase = sc.nextDouble();
        System.out.println("Enter height of the triangle: ");
        double triangleHeight = sc.nextDouble();
        System.out.println("Area of the Triangle: " + shape1.calculateTriangleArea(triangleBase, triangleHeight));

        System.out.println("Enter side of the hexagon: ");
        double hexagonSide = sc.nextDouble();
        System.out.println("Area of the Hexagon: " + shape1.calculateHexagonArea(hexagonSide));

        sc.close();
    }
}
