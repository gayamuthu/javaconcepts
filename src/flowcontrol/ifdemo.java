package flowcontrol;

public class ifdemo {

	public static void main(String[] args) {
		int age=15;
		if (age>=18)
		{
			System.out.println("Allow the user to take vaccination");
		}
		else
		{
			System.out.println("vaccination is not available for below 18. wait for your turn");
		}
	}

}
