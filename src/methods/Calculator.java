package methods;

public class Calculator {

	public static void main(String[] args) {
		sum(30, 300);
		Calculator cal = new Calculator();
		cal.multiplication(450, 60);
	}

	public static void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void multiplication(int num1, int num2) {
		int num3 = num1 * num2;
		System.out.println(num3);
	}
}
