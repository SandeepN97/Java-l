package day1;

import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number that you want to reverse: ");
		int num = sc.nextInt();

		System.out.println("The number you have entered is: " + num);
		int arr[] = new int[20];
		int x = 0;

		while (num > 0) {
			int rem = num % 10;
			arr[x] = rem;
			x++;
			num = num / 10;
		}
		System.out.println("The number after reverse in array are : ");

		for (int i = 0; i < x; i++) {
			System.out.println("The value in arr[" + i + "] : " + arr[i]);
		}

		System.out.print("The number in reverse is: ");
		for (int i = 0; i < x; i++) {
			System.out.print(arr[i]);
		}

		System.out.println(" ");
		int sum = 0;
		for (int i = 0; i < x; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of the number is: " + sum);
	}

}
