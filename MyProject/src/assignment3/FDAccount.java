package assignment3;
import java.util.Scanner;

public class FDAccount extends Account {
	Scanner obj = new Scanner(System.in);
    @Override
    public double calculateInterest(double amount)  {
    	this.amount = amount;
    	String accountType;
		int noOfDays;
		System.out.println("Enter the days");
		noOfDays = obj.nextInt();
		if(amount < 1000000) {
			System.out.println("Enter Account Type: (General OR Senior)");
			accountType = obj.next();
			accountType.toLowerCase();
			if(accountType.equals("general")) {
				if(noOfDays >= 7 &&  noOfDays <= 14) {
					interestRate = 4.50;	
				}
				if(noOfDays > 14 &&  noOfDays <= 29) {
					interestRate = 4.75;	
				}
				if(noOfDays > 29 &&  noOfDays <= 45) {
					interestRate = 5.50;	
				}
				if(noOfDays > 45 &&  noOfDays <= 60) {
					interestRate = 7.00;	
				}
				if(noOfDays > 60 &&  noOfDays <= 184) {
					interestRate = 7.50;	
				}
				if(noOfDays > 184 &&  noOfDays <= 365) {
					interestRate = 8.00;	
				}
			}
			else if(accountType.equals("senior")) {
				
				if(noOfDays >= 7 &&  noOfDays <= 14) {
					interestRate = 5.00;	
				}
				if(noOfDays > 14 &&  noOfDays <= 29) {
					interestRate = 5.25;	
				}
				if(noOfDays > 29 &&  noOfDays <= 45) {
					interestRate = 6.00;	
				}
				if(noOfDays > 45 &&  noOfDays <= 60) {
					interestRate = 7.50;	
				}
				if(noOfDays > 60 &&  noOfDays <= 184) {
					interestRate = 8.00;	
				}
				if(noOfDays > 184 &&  noOfDays <= 365) {
					interestRate = 8.50;	
				}
			}
			else {
				System.out.println("Invalid Account Type !!");
			}
		}
		else {
			if(noOfDays >= 7 &&  noOfDays <= 14) {
				interestRate = 6.50;	
			}
			if(noOfDays > 14 &&  noOfDays <= 29) {
				interestRate = 6.75;	
			}
			if(noOfDays > 29 &&  noOfDays <= 45) {
				interestRate = 6.75;	
			}
			if(noOfDays > 45 &&  noOfDays <= 60) {
				interestRate = 8.00;	
			}
			if(noOfDays > 60 &&  noOfDays <= 184) {
				interestRate = 8.50;	
			}
			if(noOfDays > 184 &&  noOfDays <= 365) {
				interestRate = 10.00;	
			}
		}

		
		if(noOfDays < 7) {
			System.out.println("Invalid Maturity Period !!");
			return -1;		
		}
		else	
			return amount * interestRate / 100;
    }
}

