package nonprimitive;

public class Heteroarray {

	public static void main(String[] args) {
		Object student[] = new Object[5];
		student[0] = 20;
		student[1] = "Gayathri";
		student[2] = 'F';
		student[3] = 98.5;
		student[4] = "Automation Testing";
		for (Object Details : student) {
			System.out.println(Details);
		}
	}

}
