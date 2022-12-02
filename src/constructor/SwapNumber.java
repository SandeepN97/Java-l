package constructor;

import java.util.*;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("The numbers before swaping are: Num1 = " + num1 + " Num2 = " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("The numbers after swaping are: Num1 = " + num1 + " Num2 = " + num2);
	}

}
