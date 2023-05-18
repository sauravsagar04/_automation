package assignment4;
import java.util.*;
class myList{
	List <String> l1 = new ArrayList<String>();
	public void insert(String a)
	{
		l1.add(a);
	}
	public Boolean search(String a)
	{
		return(l1.contains(a));
	}
	public void delete(String ind)
	{
		l1.remove(ind);
	}
	public void display()
	{
//	 System.out.println(l1);
		
		for(String s: l1)
			System.out.println(s);
		
	}


}
public class Opr{
	public static void main(String[] args) {
		myList obj1 = new myList();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("ENTER YOUR CHOICE :- ");
		System.out.println("PRESS  INSERT");
		System.out.println("PRESS  SEARCH");
		System.out.println("PRESS  DELETE");
		System.out.println("PRESS  DISPLAY");
		String x = sc.next();
		switch(x) {
		case "insert":
			String l = sc.next();
			obj1.insert(l);
			System.out.print("inserted /n");
			break;
		case "search":
			String p = sc.next();
			obj1.search(p);
			break;
		case "delete":
			String del = sc.next();
			obj1.delete(del);
			break;
		case "display":
			obj1.display();
			break;
		case "exit":
			System.out.print("INVALID INPUT");
		}
		}
//		
	}
	
	}
