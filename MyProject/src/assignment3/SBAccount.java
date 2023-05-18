package assignment3;
import java.util.*;

public class SBAccount extends Account {
	Scanner obj = new Scanner(System.in);
	public double calculateInterest(double amount) {
		this.amount = amount;
		String accountType;
		System.out.println("Enter Account Type: (NRI OR Normal)");
		accountType = obj.next();
		accountType.toLowerCase();
		if(accountType.equals("nri") || accountType.equals("normal")) {
			if(accountType.equals("nri"))
				interestRate = .04;
			if(accountType.equals("normal"))
				interestRate = .06;
		}		
		else {
			System.out.println("Invalid Account Type !");
		}
		return amount*interestRate;	
	}
}



