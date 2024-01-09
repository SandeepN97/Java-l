package day9;

public class AssignmentMain extends ParentsAssignment{
    public static void main(String[] args){
        //creating object of ChildAssignment class
        ChildAssignment childAssignment = new ChildAssignment();
        //calling behavior of ChildAssignment class
        System.out.println();
        System.out.println("child class methods");
        childAssignment.child_method1();
        childAssignment.child_method2("Child");
        childAssignment.child_method3("Child", 5);
        System.out.println();
        System.out.println("parent class methods");
        childAssignment.parent_method1();
        childAssignment.parent_method2("Parent");
        childAssignment.parent_method3("Parent", 5);
    }
}
