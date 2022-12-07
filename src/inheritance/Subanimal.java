package inheritance;

public class Subanimal extends Animal {
	public void eat() {
		System.out.println("subanimal can eat more");
	}
	public static void main(String[] args) {
		Animal an = new Subanimal();
		an.run();
		an.eat();
	}
}
