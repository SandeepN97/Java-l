package day9;

public class ParentsAssignment {
    //create 3 method with different parameter
    public void parent_method1(){
        System.out.println("This is a method with no parameter");
    }
    public void parent_method2(String name){
        System.out.println("This is a method with one parameter " + name);
    }
    public void parent_method3(String name, int age){
        System.out.println("This is a method with two parameter " + name + " " + age);
    }
}
