package ttn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class CollectionTest {
	public static void main(String [] args) {
//		Set s = new HashSet();
//		s.add(1);
//		s.add("web");
//		s.add(1);
//		s.add("web");
//		System.out.println(s.size());
//		System.out.println(s);
//		
//		Set<String> st = new TreeSet<String>();
//		st.add("web");
//		st.add("dev");
//		st.add("app");
//		st.add("proxy");
//		System.out.println(st);
		
//		Set<Student> su = new HashSet<Student>();
//		su.add(new Student("saurav",100));
//		su.add(new Student("saurav",100));
//		
//		System.out.println(su);
		
		
		
		
		Map<String, String> m = new HashMap<String, String>();
		m.put("A","Atul");
		m.put("B", "Ball");
		m.put("C", "Cap");
		if(m.containsKey("A"))
			System.out.println("Already present");
		else
			m.put("A", "Apple");
			
//		System.out.println(m);
		
		System.out.println(m.get("C"));
		
		Set<String> s = m.keySet(); // it will store the key value to set.
		System.out.println(s);
		
		System.out.println(m.values());
		
	}

}
