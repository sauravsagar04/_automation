package assignment5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


class ListSort {
	List<Integer> getValues(Map<String, Integer> mi) {
		List<Integer> sortedList = new ArrayList<Integer>(mi.values());
		Collections.sort(sortedList);
		return sortedList;
	}
}

public class OrderedList {
	public static void main(String []args) {
	    Map<String, Integer> mi = new HashMap<String, Integer>();
	    ListSort li = new ListSort();
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("\t 1. add");
				System.out.println("\t 2. Display Map");
				System.out.println("\t 3. Display Sorted List");
				System.out.println("\t 4. Exit");
				int option  = sc.nextInt();
				switch(option) {
				case 1: 
					String k = sc.next();
					if(!mi.containsKey(k)) {
						int i = sc.nextInt();
						mi.put(k, i);
						System.out.println("Value Added....");
					}
					else
						System.out.println("Value Already Present");
					break;
					
				case 2:
					System.out.println(mi);
					break;
				
				case 3:
					System.out.println(li.getValues(mi));
					break;
					
				case 4:
					System.exit(0);
					
				default:
					System.out.println("invalid choice!!!");
				}	
			}
		}
	}

}



