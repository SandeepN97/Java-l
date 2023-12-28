package day4;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Creating an instance of the Shape class
        Shape shape = new Shape();

        // Calling methods to find the area of different shapes
        System.out.println("Enter radius of the circle: ");
        double circleRadius = sc.nextDouble();
        System.out.println("Area of the Circle: " + shape.calculateCircleArea(circleRadius));

        System.out.println("Enter side of the square: ");
        double squareSide = sc.nextDouble();
        System.out.println("Area of the Square: " + shape.calculateSquareArea(squareSide));

        System.out.println("Enter length and width of the rectangle: ");
        double rectangleLength = sc.nextDouble();
        double rectangleWidth = sc.nextDouble();
        System.out.println("Area of the Rectangle: " + shape.calculateRectangleArea(rectangleLength, rectangleWidth));

        System.out.println("Enter base and height of the triangle: ");
        double triangleBase = sc.nextDouble();
        double triangleHeight = sc.nextDouble();
        System.out.println("Area of the Triangle: " + shape.calculateTriangleArea(triangleBase, triangleHeight));

        System.out.println("Enter side of the hexagon: ");
        double hexagonSide = sc.nextDouble();
        System.out.println("Area of the Hexagon: " + shape.calculateHexagonArea(hexagonSide));

        sc.close();
    }

    // Method to calculate the area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the area of a square
    public double calculateSquareArea(double side) {
        return Math.pow(side, 2);
    }

    // Method to calculate the area of a rectangle
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a hexagon
    public double calculateHexagonArea(double side) {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}
