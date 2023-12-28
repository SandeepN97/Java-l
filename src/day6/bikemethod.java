package day6;

public class bikemethod {
    //Create a class Bike with 5 method and method name should be features

    public static void features(String feature) {
        System.out.println("Feature: " + feature);
    }

    public static  void features(boolean engineStarted) {
        if (engineStarted) {
            System.out.println("Engine Started");
        } else {
            System.out.println("Engine Not Started");
        }
    }

    public static void features(int speed) {
        System.out.println("Accelerating at speed: " + speed + " km/h");
    }

    public static void features(char brakeAction) {
        if (brakeAction == 'A') {
            System.out.println("Brakes Applied");
        } else if (brakeAction == 'R') {
            System.out.println("Brakes Released");
        } else {
            System.out.println("Invalid Brake Action");
        }
    }

    public static void features() {
        System.out.println(" Feature: Bikes have Two Wheels");
    }

}
