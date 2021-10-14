package collection.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> branch	= new HashSet<String>();
		branch.add("EEE");
		branch.add("ECE");
		branch.add("CSE");
		System.out.println(branch);
		System.out.println(branch.size());
		branch.add("ECE");
		System.out.println(branch.size());	
	}

}
