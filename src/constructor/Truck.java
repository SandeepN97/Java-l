package constructor;

public class Truck {
	private String vinNumber;
	private int price;
	private String color;

	private static String type;

	Truck(String vinNumber, int price, String color) {
		this.vinNumber = vinNumber;
		this.price = price;
		this.color = color;
	}

	public void info() {
		System.out.println("The Vin Number for the car is: " + vinNumber);
		System.out.println("Price for the car is: " + price);
		System.out.println("Color for the car is: " + color);
		System.out.println("The type of truck is: " + type);
	}

	public static void main(String[] args) {
		Truck t = new Truck("5u333", 20000, "white");
//	t.info();
		type = "ford";
		t.info();
	}
}
