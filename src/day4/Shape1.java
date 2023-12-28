package day4;

// Class to calculate the area of different shapes

public class Shape1 {
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

