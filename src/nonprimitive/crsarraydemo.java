package nonprimitive;

public class crsarraydemo {

	public static void main(String[] args) {
		String car[]=new String[5];
car[0]="Toyato";		
car[1]="Benz";
car[2]="BMW";
car[3]="Audi";
car[4]="Nissan";
for (String cartype : car) {
	System.out.println(cartype);
}
	}

}
