package day3;

public class Method {

	static void meanMethod() {
		System.out.println("learning to right method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meanMethod();
		meanMethod();
		int age = 20;
		if (age > 18) {
			System.out.println("You are old enough to smoke");
		}
		int number = 12;
		if (number % 2 == 0) {
			System.out.println("EVEN NUMBER");
		} else {
			System.out.println("odd number");
		}
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR");
		}
	}

}
