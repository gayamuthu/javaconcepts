package constructordemo;

public class Batch15 {
String name;
char gender;
boolean isfresher;

public Batch15(String sname, char sgender, boolean sisfresher)
{
	this.name=sname;
	this.gender=sgender;
	this.isfresher=sisfresher;
	
}
public static void main(String[] args) {
	Batch15 s1=new Batch15("Gayathri",'F' , true);
	System.out.println(s1.gender);
}
}
