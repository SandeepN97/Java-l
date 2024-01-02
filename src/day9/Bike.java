package day9;

public class Bike {
     //create 3 constructor with different parameter
    //create default constructor
    public  Bike(){
        System.out.println("This is a constructor with no parameter");
    }
    //create a constructor with one parameter
    public Bike(String name){
        System.out.println("This is a constructor with one parameter " + name);
    }
    //create a constructor with two parameter
    public  Bike(String name, int gare){
        System.out.println("This is a constructor with two parameter " + name + " " + gare);
    }

    //create 5 behavior with different parameter
    public void start(){
        System.out.println("Start the bike");
    }
    public void stop(){
        System.out.println("Stop the bike");
    }
    public void accelerate(){
        System.out.println("Accelerate the bike");
    }
    public void decelerate(){
        System.out.println("Decelerate the bike");
    }
    public void changeGear(){
        System.out.println("Change the gear");
    }

}
