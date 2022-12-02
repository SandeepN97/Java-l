package staticKeyword;

public class Test1 {
	private static int max = 500;
	private int min;

	Test1() {

	}

	Test1(int max, int min) {
		Test1.max = max;
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		Test1.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void display() {
		System.out.println("The static max is: " + this.max);
		System.out.println("The non static min is: " + min);
		System.out.println(this);
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		// Test1 te = new Test1();

		max = 20;
		System.out.println("The first static " + max);

		t.min = 10;

		max = 40;
		System.out.println("The first static " + max);
		// te.min = 30;

		max = 9000;
		System.out.println("The first static " + max);
		t.display();
		// te.display();
	}
}
