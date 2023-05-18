package assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
	
	public static void main(String [] args) {
		Map<LoginObject, LoginPassword> user = new HashMap<LoginObject, LoginPassword>();

		
		user.put(new LoginObject("saurav"),new LoginPassword("12345"));
		
		while(true) {
			System.out.println("/t 1. Login User");
			System.out.println("/t 2. Add user");
			
		}
		
		
		
//		user.put("saurav", "12345");
//		user.put("sagar", "12346");
//		user.put("raj", "12347");
//		user.put("rohan", "12348");
//		user.put("swaraj", "12349");
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the UserName: ");
//		String username = sc.next();
//		if(user.containsKey(username)) {
//			System.out.println("Enter the Password: ");
//			String password = sc.next();
//			if(user.get(username).equals(password)) {
//				System.out.println("Successful login..");
//			}
//			else {
//				System.out.println("Invalid password");
//			}
//			
//		}
//		else {
//			System.out.println("Invalid username!!");
//		}
//	}
}
