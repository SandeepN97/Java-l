package day3;

import java.util.*;

public class EvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// taking input form the user
		Scanner sc = new Scanner(System.in);

		// declaring the size of the array
		int size;
		System.out.print("Enter the size of array: ");
		size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the element in array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.println("The element in array arr[" + i + "] : " + arr[i]);
		}

		System.out.println("The even numbers are: ");
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
