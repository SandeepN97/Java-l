package day2;

public class CarImplementation {
	public static void main(String[] args) {

		Car c = new Car();

		c.speed();
		c.horn();
		System.out.println(c);

		System.out.println("The initial price of the car is: " + c.getPrice());

		c.setPrice(2000000);

		System.out.println("The changed price of the car is: " + c.getPrice());

	}
}
