package assignment4;
import java.util.*;

public class StringOperation {
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
		 List<String> StringObj = new ArrayList<String>();
		 int option;
		 while(true) {
			 	System.out.println("\t 1. INSERT");
				System.out.println("\t 2. SEARCH");
				System.out.println("\t 3. DELETE");
				System.out.println("\t 4. DISPLAY");
				System.out.println("\t 5. Exit");
				System.out.println("\t Select an Option:  ");
				option = obj.nextInt();
				
				switch(option) {
				case 1:
					System.out.println("Enter the item to be inserted");
					String ins = obj.next();
					if(StringObj.add(ins)== true)
						System.out.println("inserted Successfully");
					break;
				case 2:
					System.out.println("Enter the item to be searched");
					String sea = obj.next();
					if(StringObj.contains(sea)!= true)
						System.out.println("Item not found in the list");
					else
						System.out.println("Item present in the list");
					break;
				case 3:
					System.out.println("Enter the item to be deleted");
					String del = obj.next();
					if(StringObj.remove(del) != true)
						System.out.println("Item does not exist");
					else
						System.out.println("Deleted Successfully...");
					break;
				case 4:
						System.out.println(StringObj);
					break;	
				case 5:
					System.exit(0);
				default:
					System.out.println("invalid choice!!!");	
				}
	   }	

   }
	
}