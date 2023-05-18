package assignment3;
import java.util.Scanner;

public class RDAccount extends Account {  
    Scanner obj = new Scanner(System.in);
    @Override
    public double calculateInterest(double amount)  {
    	this.amount = amount;
    	String accountType;
		System.out.println("Enter Account Type: (General OR Senior)");
		accountType = obj.next();
		int noOfMonths;
		System.out.println("Enter the Maturity Period");
		noOfMonths = obj.nextInt();
		accountType.toLowerCase();
		
		if(accountType.equals("general")) {
			if(noOfMonths > 0 &&  noOfMonths <= 6) {
				interestRate = 7.50;	
			}
			if(noOfMonths > 6 &&  noOfMonths <= 9) {
				interestRate = 7.75;	
			}
			if(noOfMonths > 9 &&  noOfMonths <= 12) {
				interestRate = 8.00;	
			}
			if(noOfMonths > 12 &&  noOfMonths <= 15) {
				interestRate = 8.25;	
			}
			if(noOfMonths > 15 &&  noOfMonths <= 18) {
				interestRate = 8.50;	
			}
			if(noOfMonths > 18 &&  noOfMonths <= 21) {
				interestRate = 8.75;	
			}
		}
		else if(accountType.equals("senior")) {
			if(noOfMonths > 0 &&  noOfMonths <= 6) {
				interestRate = 8.00;	
			}
			if(noOfMonths > 6 &&  noOfMonths <= 9) {
				interestRate = 8.25;	
			}
			if(noOfMonths > 9 &&  noOfMonths <= 12) {
				interestRate = 8.50;	
			}
			if(noOfMonths > 12 &&  noOfMonths <= 15) {
				interestRate = 8.75;	
			}
			if(noOfMonths > 15 &&  noOfMonths <= 18) {
				interestRate = 9.00;	
			}
			if(noOfMonths > 18 &&  noOfMonths <= 21) {
				interestRate = 9.25;	
			}
		}
		else {
			System.out.println("Invalid Account type !!");;
		}

		if(noOfMonths <= 0) {
			System.out.println("Invalid Maturity Period !!");
			return -1;	
		}
		else	
			return amount * interestRate / 100;
    }
}
