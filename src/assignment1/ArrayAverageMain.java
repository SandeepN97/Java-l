package assignment1;

import java.util.Scanner;

public class ArrayAverageMain {
    public static void main(String[] args) {
        ArrayAverage arrayAverage = new ArrayAverage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i + 1) + " of array: ");
            int element = sc.nextInt();
            arr[i] = element;
        }
        double average = arrayAverage.average(arr);
        System.out.println("Average of array elements is: " + average);
    }
}
