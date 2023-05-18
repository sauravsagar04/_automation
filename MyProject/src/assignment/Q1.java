package assignment;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
//		System.out.println("Enter Number: ");
//        Scanner obj = new Scanner(System.in);
//        int arr[] = {1,3,4,2,0,2};
//        int t = 4;
//        for(int i=0;i<arr.length;i++) {
//        	for(int j=i;j<arr.length;j++) {
//        		if(arr[i] + arr[j] == t && i != j) {
//        			System.out.println(arr[i]+" "+arr[j]);
//        			
//        		}
//        	}
//        }
		
//		int arr[] = {1,2,5,8,0,-2};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
//		
//		
//		for(char r='z';r>='a';r--) {
//			System.out.print(r+" ");
//		}
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(-9);
		l.add(9);
		
		Integer n = l.stream().min(Integer::compare).get();
		System.out.println(n);
		
        List<String> ls = new ArrayList<String>();
        ls.add("saurav");
        ls.add("sagar");
        ls.add("add");
        ls.add("dev");
        ls.add("four");
        ls.stream().filter((a)-> {return a.length()>3;}).forEach(System.out::println);
        
        
//        String str = "My name is test is test";
//        String str1 = "my name is test is test";
//        System.out.println(str.compareTo(str1));
//        String str1[] = str.split(" ");
      
        
//        HashMap<String,Integer> m = new HashMap<String, Integer>();
//        int c = 0;
//        
//        	for(int i=0;i<str.length();i++) {
//        		String s = "";
//        		if(str.charAt(i)==' ' || i == str.length())
//        		{
//        			c++;
//        			s="";
//        			s += str.charAt(i);
        			
//        		}
//        		else {
//        			s += str.charAt(i);
//        			if(m.containsKey(s)) {
//        				m.put(s, m.get(s)+1);	
//        				
//        			}
//        			else {
//        				m.put(s, 1);
//        				
//        			}
//        		}
//        		
    			
    			
    		
        		
//        	}
//        	
//        	System.out.println(m+""+c);
//        
//        obj.close();
	}

}
