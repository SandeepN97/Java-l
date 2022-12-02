package day2;

import java.util.*;

public class CubeOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter the number: ");
		num1 = sc.nextInt();
		System.out.print("Enter the number: ");
		num2 = sc.nextInt();

		findCube(num1, num2);

		// System.out.println("The cube of the given two number are : " + cube + " " +
		// cube);
	}

	public static int findCube(int num1, int num2) {
		int cube1 = num1 * num1 * num1;
		int cube2 = num2 * num2 * num2;
		System.out.println("The cube of the given two number are : " + cube1 + " " + cube2);
		return 0;
	}

}
