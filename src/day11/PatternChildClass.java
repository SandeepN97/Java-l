package day11;


//Q2:-Write a Java Code with a Class having 4 methods , in each method you have print a new Star pattern create another
// child class which will inherit the parent class with 4 methods and with the help of child class object call all the 4 methods.
public class PatternChildClass extends Pattern {
    public static void main(String[] args) {
        //creating object of PatternChildClass class
        PatternChildClass parentChildClass = new PatternChildClass();
        parentChildClass.pattern1();
        parentChildClass.pattern2();
        parentChildClass.pattern3();
        parentChildClass.pattern4();
    }
}
