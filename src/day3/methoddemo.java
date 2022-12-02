package day3;

public class methoddemo {
	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		int resulta = callme(x, y);
		System.out.println(resulta);
	}

	static int callme(int x, int y) {
		int tempa = x * x + y;
		return tempa;
	}
}
