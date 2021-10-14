package nonprimitive;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class arraydemo {

	public static void main(String[] args) {
		double d[] = new double[5];
		d[0] = 33.55;
		d[1] = 10.33;
		d[2] = 22.5;
		d[3] = 11.5;
		d[4] = 77.5;
System.out.println("size of the array" +d.length);
System.out.println(d[3]);
	for (double e : d) {
	System.out.println(e);	
	}
	}

}
