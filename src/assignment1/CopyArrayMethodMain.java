package assignment1;

import java.util.Scanner;

public class CopyArrayMethodMain {
    public static void main(String[] args) {
        CopyArrayMethod copyArrayMethod = new CopyArrayMethod();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int size = scanner.nextInt();
        int arr1[] = new int[size];
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i + 1) + " of array 1: ");
            int element = scanner.nextInt();
            arr1[i] = element;
        }
        int length = copyArrayMethod.copyArray(arr1, arr2);
        System.out.println("Length of array 2 is: " + length);
        System.out.println("Elements of array 2 are: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
