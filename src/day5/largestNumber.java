package day5;

import java.util.Scanner;

public class largestNumber {
    public void  largestNum(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int arrSize = sc.nextInt();

        int[] myArray = new int[arrSize];

        for(int i = 0; i < arrSize; i++){
            System.out.println("Enter the number at index " + i + ": " );
            myArray[i] = sc.nextInt();
        }

        int largest = myArray[0];

        for(int i = 0; i < arrSize; i++){
            if(myArray[i] > largest){
                largest = myArray[i];
            }
        }
        System.out.println("The largest number in the given array is: " + largest);
    }
}
