package ifelse;

import java.util.*;

public class VotingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Age: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are elligible to vote");
		} else {
			System.out.println("You are not elligible to vote");
		}
	}

}
