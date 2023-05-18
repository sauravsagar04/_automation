package ttn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringListLambda {
	public static void main(String args[]) {
		StringListSort ss = (s) -> {
			Collections.sort(s,(s1,s2)->s1.length()-s2.length());
			return s;
		};
		
		List<String> s =new  ArrayList<>();
		s.add("saurav");
		s.add("sagar");
		s.add("raj");
		
		System.out.println(ss.sortList(s));
		
	}

}
