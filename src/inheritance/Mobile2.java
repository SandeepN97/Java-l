package inheritance;

public class Mobile2 extends Mobile {
	public void ring() {
		System.out.println("Mobile2 has a ring");
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.ring();
		Mobile m2 = new Mobile2();
		m2.ring();
		Mobile m1 = new Mobile1();
		m1.ring();
		
		
		
	}
}

				