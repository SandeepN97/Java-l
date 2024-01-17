package assignment1;

import java.util.Scanner;

public class ArraySumMethodMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraySumMethod arraySumMethod = new ArraySumMethod();
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i + 1) + " of array: ");
            int element = scanner.nextInt();
            arr[i] = element;
        }
        int sum = arraySumMethod.sum(arr);
        System.out.println("Sum of array elements is: " + sum);
    }
}
