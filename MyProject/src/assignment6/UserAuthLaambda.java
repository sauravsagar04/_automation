package assignment6;
import java.util.Scanner;
public class UserAuthLaambda {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		UserAuth ua = (username,password) -> {
			System.out.println("Using lambda exp for Authentcation:");
			System.out.println("Enter the username");
			String uname = sc.next();
			boolean ans;
			if(username.equals(uname)) {
				System.out.println("Enter the password");
				String pass = sc.next();
				if(pass.equals(password)) {
					ans = true;
				}
				else {
					ans = false;
				}
			}
			else {
				ans = false;
			}
			
			return ans;	
		};
		
		System.out.println(ua.userauth("saurav","12345"));
		
	sc.close();
	}
}
