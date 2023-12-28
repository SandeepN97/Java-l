package day6;

public class TwoForLoopMethod {
    public static void firstForLoop(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("The increment number is: " + i);
        }
    }

    //start = 20
    //end = 10

    public static void secondForLoop(int startNum, int endNum) {
        for (int i = startNum; i >= endNum; i--) {
            System.out.println("The decrement number is: " + i);
        }
    }
}