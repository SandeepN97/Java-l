package inheritance;

public class Jeep extends Vehicle {
	public void horn() {
		System.out.println("jeep has a horn that says beep");
	}

	public void color() {
		System.out.println("jeep has black color");
	}

	public void size() {
		System.out.println("jeep size is big");
	}

	public void weel() {
		System.out.println("jeep has four weel");
	}

	public static void main(String[] args) {

		Jeep j = new Jeep();
		j.color();
		j.horn();

		Vehicle je = new Jeep();
		je.horn();

		j = new Jeep();

		Jeep jr = (Jeep) j;
		jr.weel();

	}
}
