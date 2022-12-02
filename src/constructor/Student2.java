package constructor;

public class Student2 {
	public String name = "sandeep";
	public int age;

	Student2() {

	}

	Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Name of the student is: " + name);
		System.out.println("Age of the student is: " + age);
	}

}
