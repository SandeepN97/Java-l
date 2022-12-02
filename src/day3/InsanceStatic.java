package day3;

public class InsanceStatic {

	/*
	 * there are different type of variable to store data throughout the program.
	 * instance variable -> instance variable are declared inside the class but
	 * outside the scope of any method are called instance variable -> instance
	 * variable are initialized at the time of the class loading or when an object
	 * of the class is created. -> instance variable can be declared using different
	 * access modifiers available in java like default, private, public and
	 * protected.
	 * 
	 */
	public String name; // public instance
	String division; // default instance
	private int age; // private instance

	// constructor that initialize an instance variable
	public InsanceStatic(String sname) {
		name = sname;
	}

	public void setDiv(String sdiv) {
		division = sdiv;
	}

	public void setAge(int sage) {
		age = sage;
	}

	public void printstud() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Division: " + division);
		System.out.println("Student Age: " + age);
	}

	public static void main(String args[]) {
		InsanceStatic s = new InsanceStatic("Monica");
		s.setAge(14);
		s.setDiv("B");
		s.printstud();

		/*
		 * 1. local variable are declared within a method are called local variable -
		 * The scope of the local variable is limited to the method it is declared
		 * inside. - A local variable starts its lifetime when the method it invoked. -
		 * local variable is created to all the objects of the class.
		 * 
		 * 2. An instance variable are declared inside a class but outside of any method
		 * or block - An instance variable is accessible throughout the class. - The
		 * object associated with the instance variable decides its lifetime. - instance
		 * variable has different copies for different objects. - Use to store values
		 * that are needed to be accessed by different methods of the class.
		 * 
		 * 3. static variable are declared inside a class but outside of a method string
		 * with a keyword static. - static variable are declared inside a class but
		 * outside of a method starting with a keyword static. - the static variable is
		 * accessible accessible throughout the class - the static variable has the same
		 * lifetime as the program. - static variable only have one single copy of the
		 * entire class.
		 * 
		 * java virtual machine is an abstract machine -specification that provides
		 * runtime environment - first converts to java bytecode can be executed -The
		 * JVM performs following operation -- loads code -- verifies code -- Execute
		 * code -- Provides runtime environment -- -- first
		 * 
		 */
	}
}
