package staticKeyword;

import java.util.*;

public class TestImplementatin extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Test t = new Test();

		System.out.println("Enter the first Number: ");
		int num1 = sc.nextInt();
		t.setNum1(num1);

		System.out.println("Enter the second Number: ");
		int num2 = sc.nextInt();
		t.setNum2(num2);

		System.out.println("The addition of two number is: " + add(t.getNum1(), t.getNum2()));
		System.out.println("The multiplicaiton of two number is: " + t.multiply(t.getNum1(), t.getNum2()));

	}

}
