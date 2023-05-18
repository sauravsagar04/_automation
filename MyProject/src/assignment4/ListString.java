package assignment4;

import java.util.ArrayList;
import java.util.List;

public class ListString {
	public static void main(String []args) {
		List<StringObjects> li = new ArrayList<StringObjects>();
		li.add(new StringObjects(100, "Tkjd", "ddn"));
	
		for(StringObjects sobj: li) {
			System.out.println(sobj.getId());
		}
	}
}
