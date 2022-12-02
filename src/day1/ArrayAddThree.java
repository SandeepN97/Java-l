package day1;

import java.util.*;

public class ArrayAddThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size;

		size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the array element: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The array element after adding 3 are: ");
		for (int i = 0; i < size; i++) {
			arr[i] = arr[i] + 3;
			System.out.println(arr[i]);
		}
	}

}
