package staticKeyword;

public class Test {
	private int num1;
	private int num2;

	Test() {

	}

	Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public int multiply(int num1, int num2) {
		int multiply = num1 * num2;
		return multiply;
	}

}
