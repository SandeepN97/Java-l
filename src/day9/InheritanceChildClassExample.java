package day9;

public class InheritanceChildClassExample extends InheritanceParentClassExample {
    //create 4 method with different parameter
    //create a method with no parameter
    public void child_method1(){
        System.out.println("This is a method with no parameter");
    }
    //create a method with one parameter
    public void child_method2(String name){
        System.out.println("This is a method with one parameter " + name);
    }
    //create a method with two parameter
    public void child_method3(String name, int age){
        System.out.println("This is a method with two parameter " + name + " " + age);
    }
    //create a method with three parameter
    public void child_method4(String name, int age, String breed){
        System.out.println("This is a method with three parameter " + name + " " + age + " " + breed);
    }
    //create a method with four parameter
    public void child_method5(String name, int age, String breed, String color){
        System.out.println("This is a method with four parameter " + name + " " + age + " " + breed + " " + color);
    }

}
