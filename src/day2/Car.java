package day2;

public class Car {
	private int price;
	private String color;
	private double height;

	Car() {
		this.price = 2000;
		this.color = "white";
		this.height = 2.5;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", height=" + height + "]";
	}

	Car(int carPrice, String carColor, double carHeight) {
		this.price = carPrice;
		this.color = carColor;
		this.height = carHeight;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public double getHeight() {
		return height;
	}

	public void setPrice(int carPrice) {
		this.price = carPrice;
	}

	public void setYear(String carColor) {
		this.color = carColor;
	}

	public void setType(double carHeight) {
		this.height = carHeight;
	}

	public void speed() {
		System.out.println("Car always have a speed...");
	}

	public void horn() {
		System.out.println("Car can beep a horn !!!");
	}
}
