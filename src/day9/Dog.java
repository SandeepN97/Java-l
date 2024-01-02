package day9;

public class Dog {
    //constructor name should be same as class name
    //constructor do not have any type
    //you do not need to call a constructor it is going to initialize at the time of object creation
    //constructor can be overloaded
    //create a constructor with no parameter
    public Dog(){
        System.out.println("This is a constructor");
    }
    //create a constructor with one parameter
    public Dog(String name){
        System.out.println("This is a constructor with one parameter " + name);
    }
    //create a constructor with two parameter
    public Dog(String name, int age){
        System.out.println("This is a constructor with two parameter " + name + " " + age);
    }
    //create a constructor with three parameter
    public Dog(String name, int age, String breed){
        System.out.println("This is a constructor with three parameter " + name + " " + age + " " + breed);
    }
    //create a constructor with four parameter
    public Dog(String name, int age, String breed, String color){
        System.out.println("This is a constructor with four parameter" + name + " " + age + " " + breed + " " + color);
    }
    //create behavior of Dog class
    public void bark(){
        System.out.println("Barking : Bow Bow Bow");
    }
    public void eat(){
        System.out.println("Eating : Chicken + Pedigree");
    }
    public void sleep(){
        System.out.println("Sleeping : 8 hours");
    }
    public void run(){
        System.out.println("Running : 10 km");
    }
    public void walk(){
        System.out.println("Walking : 5 km");
    }

}


