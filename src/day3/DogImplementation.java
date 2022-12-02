package day3;

public class DogImplementation {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.walk();
		d.bark();

		System.out.println("first the dog color was: " + d.getColor());
		System.out.println("first the dog has:  " + d.getNose());

		d.color = "red";

		System.out.println(d.color);

	}

}
