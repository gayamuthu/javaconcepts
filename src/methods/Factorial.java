package methods;

public class Factorial {

	public static void main(String[] args) {

		int num = 10;
		long factorial = 1;
		fac(10, 1);
	}

	public static void fac(int num, long factorial) {
		for (int i = 1; i <= num; ++i) {
			 factorial = factorial * i;
			//factorial *= i;
		}
		System.out.printf("Factorial of %d = %d", num, factorial);
	}
}
