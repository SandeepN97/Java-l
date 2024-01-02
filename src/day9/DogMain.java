package day9;

public class DogMain {
    public static void main(String[] args){
        //creating object of Dog class
        Dog dog = new Dog();
        //calling behavior of Dog class
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.run();
        dog.walk();

        //calling constructor with no parameter
        Dog dog1 = new Dog("Tommy");
        dog1.bark();
        dog1.eat();
        dog1.sleep();
        dog1.run();
        dog1.walk();

        //calling constructor with one parameter
        Dog dog2 = new Dog("Tommy", 5);
        dog2.bark();
        dog2.eat();
        dog2.sleep();
        dog2.run();
        dog2.walk();
        //calling constructor with two parameter
        Dog dog3 = new Dog("Tommy", 5, "Bulldog");
        dog3.bark();
        dog3.eat();
        dog3.sleep();
        dog3.run();
        dog3.walk();
        //calling constructor with three parameter
        Dog dog4 = new Dog("Tommy", 5, "Bulldog", "Brown");
        dog4.bark();
        dog4.eat();
        dog4.sleep();
        dog4.run();
        dog4.walk();
    }
}
