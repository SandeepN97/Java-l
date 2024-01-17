package assignment;

public class ThrowExceptionDemo {
    //writing throw keyword is mandatory for checked exception
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        Thread.sleep(1000);
        System.out.println("World");
    }

}
