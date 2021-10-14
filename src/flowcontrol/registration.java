package flowcontrol;

import java.util.Scanner;

public class registration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Allow the user to take vaccination");
		} else {
			System.out.println("vaccination is not available for below 18. wait for your turn");
		}
		scanner.close();

	}
}
