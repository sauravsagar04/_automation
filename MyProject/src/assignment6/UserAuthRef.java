package assignment6;

import java.util.Scanner;

public class UserAuthRef {
	public static boolean userPassAuth(String username, String password) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Using method ref for Authentcation:");
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
		sc.close();
		return ans;	
	}

	public static void main(String[] args) {
		UserAuth ua = UserAuthRef::userPassAuth;
		System.out.println(ua.userauth("saurav", "12321"));

	}

}
