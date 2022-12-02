package day3;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
	}

}
