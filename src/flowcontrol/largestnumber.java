package flowcontrol;

public class largestnumber {

	public static void main(String[] args) {
		int a=1110;
		int b=700;
		int c=1500;
		if(a>b & a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c & b>a)
		{
			System.out.println("b is greater");	
		}
		else
		{
			System.out.println("c is greater");
		}
	}

}
