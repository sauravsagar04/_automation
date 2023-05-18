package dev;
import java.util.Scanner;

public class LibraryHack {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			LibraryService ls = new LibraryService();
			
			
			while(true) {
				
				System.out.println("UserType");
				String utype = sc.nextLine();
				switch(utype) {
				case "admin":
					while(true) {
						System.out.println("1. view all book");
						System.out.println("2. add new book");
						System.out.println("3. delete book");
						System.out.println("4. get the costly book based on publisher");
						System.out.println("5. exit");
						int option = sc.nextInt();
						switch(option) {
						case 1:
							ls.getBook();
							break;
						case 2:
							System.out.println("int input");
							int a = sc.nextInt();
							System.out.println("string");
							String b = sc.next();
							System.out.println("string");
							String c = sc.next();
							System.out.println("float");
							float d = sc.nextFloat();
//						List<Book> books = new ArrayList<Book>();
							ls.addBook(new Book(a,b,c,d));
							break;
						case 3:
							int isbn = sc.nextInt();
							ls.removeBook(isbn);
							break;
						case 4:
							String p = sc.next();
							System.out.println("Max Price book for "+p+" is "+ls.findMaxPrice(p));
							break;
						case 5:
							System.exit(0);
						default:
							System.out.println("Invalid option");
						}
					}
				case "customer":
					while(true) {
						System.out.println("1. view all book in library class");
						System.out.println("2. get the costly book based on publisher");
						System.out.println("3. exit");
						int option = sc.nextInt();
						switch(option) {
						case 1:
							ls.getBook();
							break;
						case 2:
							String p1 = sc.next();
							System.out.println("Max Price book for "+p1+" is "+ls.findMaxPrice(p1));
							break;
						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid option");
						}
					}	
				case "exit":
					System.exit(0);
				default:
					System.out.println("Inavalid option");
					
				}
				
			}
		}
	}

}
