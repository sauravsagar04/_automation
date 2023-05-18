package assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Q7 {
	public static void main(String args[]) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("saurav");
		s.add("saurav");
		s.add("sagar");
		s.add("raj");
		s.add("atul");
		s.add("atul");
		
		HashMap<String,Integer> m = new HashMap<String, Integer>();
		
		for(String i : s) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);	
			}
			else {
				m.put(i, 1);
			}
			
		}
		System.out.println(m);
		
	}
	

}
