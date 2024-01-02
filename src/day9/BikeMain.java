package day9;

public class BikeMain {
    public static void main(String[] args){
        //creating object of Bike class
        Bike bike = new Bike();
        //calling behavior of Bike class
        bike.start();
        bike.stop();
        bike.accelerate();
        bike.decelerate();
        bike.changeGear();

        System.out.println();

        //calling constructor with no parameter
        Bike bike1 = new Bike( "Honda");
        bike1.start();
        bike1.stop();
        bike1.accelerate();
        bike1.decelerate();
        bike1.changeGear();

        System.out.println();

        //calling constructor with one parameter
        Bike bike2 = new Bike("Honda", 5);
        bike2.start();
        bike2.stop();
        bike2.accelerate();
        bike2.decelerate();
        bike2.changeGear();

        System.out.println();

    }
}
