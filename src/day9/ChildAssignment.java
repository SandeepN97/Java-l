package day9;

public class ChildAssignment extends ParentsAssignment{
    //create 3 method with different parameter
    public void child_method1(){
        System.out.println("This is a method with no parameter");
    }
    public void child_method2(String name){
        System.out.println("This is a method with one parameter " + name);
    }
    public void child_method3(String name, int age){
        System.out.println("This is a method with two parameter " + name + " " + age);
    }

}
