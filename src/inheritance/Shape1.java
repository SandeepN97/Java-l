package inheritance;

public class Shape1 extends Shape{
	public void parameter() {
		System.out.println("The perimeter of is: ");
	}
	
	public void area() {
		System.out.println("this is the base class area");
		}
	
	public static void main(String[] args) {
		Shape1 s = new Shape1();
		s.area();
		s.parameter();
		
		Shape ss = new Shape1();
		ss.area();
		
	}
}

