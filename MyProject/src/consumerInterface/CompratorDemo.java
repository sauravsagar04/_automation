package consumerInterface;

import java.util.ArrayList;
import java.util.List;

public class CompratorDemo {
	public static void main(String args[]) {
		
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("saurav","s@gmail.com"));
		l.add(new Employee("sagar","ss@gmail.com"));
		l.add(new Employee("raj","r@gmail.com"));
		
//		Comprator<Employee> name=(Employee e, Employee e1) -> e.getName().compareTo(e1.getname());
		List<Employee> li = new ArrayList<Employee>();
		l.stream().map(a-> a.getName()).sorted().forEach(System.out::println);
		li = li.stream().map(a-> {a.getName();}).sorted().toList();
	
		
	}

}
 