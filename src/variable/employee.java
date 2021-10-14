package variable;

public class employee {
String empname;
int empid;
static String emporg="H2k";
public static void main(String[] args) {
	employee e1=new employee();
	e1.empname="Rajesh";
	e1.empid=230;

	System.out.println("***Details of the employee e1***");
	System.out.println(e1.empname);
	System.out.println(e1.empid);
	System.out.println(employee.emporg);
	
	
	
}
}
