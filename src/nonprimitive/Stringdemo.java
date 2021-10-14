package nonprimitive;

public class Stringdemo {

	public static void main(String[] args) {
		String s1="hello world";
		String s2=" HELLO";
		String s3="hello";
		System.out.println(s1.length());
		System.out.println(s2.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.replace('h', 'H'));
		System.out.println(s1.contains(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(0, 3));
		System.out.println(s1.equals(s2));
	}

}
