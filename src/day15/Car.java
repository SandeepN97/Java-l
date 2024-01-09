package day15;

public class Car implements CarInterface {
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }
    @Override
    public void accelerate(){
        System.out.println("Car is accelerating");
    }
    @Override
    public void gear(){
        System.out.println("Car is changing gear");
    }
    @Override
    public void brake(){
        System.out.println("Car is braking");
    }


}



