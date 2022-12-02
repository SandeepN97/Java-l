package staticKeyword;

import java.util.*;

public class Test1Implementaion extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Test1 te = new Test1();
		Test1 tes = new Test1();

		System.out.println("Enter the maximum number: ");
		int maxNum = sc.nextInt();
		te.setMax(maxNum);

		System.out.println("Enter the minimum number: ");
		int minNum = sc.nextInt();
		te.setMin(minNum);

		System.out.println("The static Max number is: " + te.getMax());
		System.out.println("The not static Min number is: " + te.getMin());

		System.out.println("Enter the maximum number: ");
		maxNum = sc.nextInt();
		tes.setMax(maxNum);

		System.out.println("Enter the minimum number: ");
		minNum = sc.nextInt();
		tes.setMin(minNum);

		System.out.println("The static Max number is: " + tes.getMax());
		System.out.println("The not static Min number is: " + tes.getMin());

	}

}
