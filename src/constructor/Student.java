package constructor;

public class Student {

	public String name = "Alex";
	public int rollno;
	public int fees;

	Student() {
	}

	Student(String name, int rollno, int fees) {
		this.name = name;
		this.rollno = rollno;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", fees=" + fees + "]";
	}

	public void displayInfo() {
		System.out.println("The name of the student is: " + name);
		System.out.println("Roll no of the student is: " + rollno);
		System.out.println("Fee for the student is: " + fees);
	}

}
