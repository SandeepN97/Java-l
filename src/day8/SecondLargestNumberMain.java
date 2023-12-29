package day8;

import java.util.Scanner;

public class SecondLargestNumberMain {
    public static void main(String[] args) {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Second largest number: " + secondLargestNumber.secondLargestNumber(arr));
        scanner.close();
    }
}
