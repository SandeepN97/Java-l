package day9;

public class InheritanceMain {
    public static void main(String[] args){
        //creating object of InheritanceChildClassExample class
        InheritanceChildClassExample inheritanceChildClassExample = new InheritanceChildClassExample();
        //calling behavior of InheritanceChildClassExample class
        System.out.println();
        System.out.println("child class methods");
        inheritanceChildClassExample.child_method1();
        inheritanceChildClassExample.child_method2("Child");
        inheritanceChildClassExample.child_method3("Child", 5);
        inheritanceChildClassExample.child_method4("Child", 5, "Bulldog");
        inheritanceChildClassExample.child_method5("Child", 5, "Bulldog", "Brown");
        System.out.println();
        System.out.println("parent class methods");
        inheritanceChildClassExample.parent_method1();
        inheritanceChildClassExample.parent_method2("Parent");
        inheritanceChildClassExample.parent_method3("Parent", 5);
        inheritanceChildClassExample.parent_method4("Parent", 5, "Bulldog");
        inheritanceChildClassExample.parent_method5("Parent", 5, "Bulldog", "Brown");
    }
}
