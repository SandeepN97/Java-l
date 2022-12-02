package day3;

public class Dog {
	public String color;
	public int nose;

	public void bark() {
		System.out.println("Dog bark!!!");
	}

	public void walk() {
		System.out.println("Dog walks with four leg");
	}

	// parameterized constructor
	Dog(String c, int n) {
		color = c;
		nose = n;
	}

	Dog() {
		color = "white";
		nose = 1;
	}

	public String getColor() {
		return color;
	}

	public int getNose() {
		return nose;
	}

}
