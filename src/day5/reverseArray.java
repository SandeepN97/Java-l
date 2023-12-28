package day5;

import java.util.Scanner;

public class reverseArray {
    public void reverse(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int arraySize = sc.nextInt();

        int[] array = new int[arraySize];
        // 1 2 3 4 5
        for(int i = 0; i < arraySize ; i++)
        {
            System.out.println("Enter the array element at index " + i + " : ");
            int arrayElement = sc.nextInt();
            array[i] = arrayElement;
        }

        int start = 0;
        int end = arraySize - 1;
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            // Move to the next pair of elements
            start++;
            end--;
        }
        System.out.println("The reversed array is:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
