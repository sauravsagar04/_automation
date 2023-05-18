package com.labs;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> er = EmployeeRepository.getEmployees();
		
        Map<String, Long> mp= er.stream().filter(e->e.getDepartment()!=null).
              collect(Collectors.groupingBy
            		  (e->e.getDepartment().getDepartmentName(),Collectors.counting()));
              Optional<String> str = mp.keySet().stream().max(Comparator.comparing(mp::get));
              System.out.println("Department with max number of Employee: ");
              System.out.println(str.get());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		double total_sal = li.stream().map(e->e.getSalary()).
//				collect(Collectors.summingDouble(e->e.doubleValue()));
//	    System.out.println("Total Salary: "+total_sal);                                                         // 1.
	    
	    
//	   Map<String,Integer> m = li.stream().map(e->e.getDepartment().getDepartmentName()).collect(Collectors.groupingBy(e->e)));           // 2.
	   
//	   Map<String, Long> mp= li.stream().
//               filter(e->e.getDepartment()!=null).
//               collect(Collectors.groupingBy(e->e.getDepartment().getDepartmentName(),Collectors.counting()));
//       System.out.println(mp);
       
//       Map<String, Long> mp= li.stream().
//               filter(e->e.getDepartment()!=null).
//               collect(Collectors.groupingBy(e->e.getDepartment().getDepartmentName(),Collectors.counting()));
//       System.out.println(mp);
	    
//	   List<String> dw = li.stream().filter(e->e.getDepartment().getDepartmentName().stream().noneMatch(e::contains))
	    
//	    int count = li.stream().map(e->e.getDepartment().getDepartmentName()).collect(Collectors.counting());
	    
//	    li.stream().filter(e->e.getDepartment()==null).forEach(System.out::println);                          // 5.
	    
	 
	    
//	    li.stream().filter(e->e.getDepartment().)
	}

}
