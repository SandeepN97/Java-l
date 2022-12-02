package scanner;

import java.util.*;

public class SmallestOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println("Num1: " + num1 + " is smaller.");
		} else {
			System.out.println("Num2: " + num2 + " is smaller");
		}
	}

}
