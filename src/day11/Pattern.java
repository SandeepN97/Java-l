package day11;
//Q2:-Write a Java Code with a Class having 4 methods , in each method you have print a new Star pattern create another
//child class which will inherit the parent class with 4 methods and with the help of child class object call all the 4 methods.
public class Pattern {
    //4 method to print different pattern in each method
    public void pattern1(){
        System.out.println("Pattern 1");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(){
        System.out.println("Pattern 2");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern3(){
        System.out.println("Pattern 3");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern4(){
        System.out.println("Pattern 4");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
