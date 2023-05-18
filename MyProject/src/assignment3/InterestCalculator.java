package assignment3;
import java.util.*;

public class InterestCalculator {
	public static void main(String []args) {
		try (Scanner obj = new Scanner(System.in)) {
			int option;
			double amount;
			while(true) {
				System.out.println("Select an Option:  ");
				System.out.println("\n");
				System.out.println("\t 1. Interest Calculator-SB");
				System.out.println("\t 2. Interest Calculator-FD");
				System.out.println("\t 3. Interest Calculator-RD");
				System.out.println("\t 4. Exit");
				option = obj.nextInt();
				switch(option) {
				case 1:
					System.out.println("Enter the Average Amount in your SBAccount");
					amount = obj.nextInt();
					SBAccount sba = new SBAccount();
					if(amount > 0) {
						double gained = sba.calculateInterest(amount);
						if(gained > 0)
							System.out.println("Interest gained Rs: "+gained);	
					}
					else
						System.out.println("Invalid amount !");
					System.out.print("\n");
					break;
					
				case 2:
					System.out.println("Enter the FDAmount");
					amount = obj.nextInt();
					FDAccount fda = new FDAccount();
					if(amount > 0) {
					double gained = fda.calculateInterest(amount);
						if(gained > 0)
							System.out.println("Interest gained Rs: "+gained);
					}	
					else
						System.out.println("Invalid amount !");
					System.out.print("\n");
					break;
					
				case 3:
					System.out.println("Enter the RDAmount ");
					amount = obj.nextInt();
					RDAccount rda = new RDAccount();
					if(amount > 0) {
						double gained = rda.calculateInterest(amount);
						if(gained > 0)
							System.out.println("Interest gained Rs: "+gained);
						
					}	
					else
						System.out.println("Invalid Amount !");
					System.out.print("\n");
					break;
					
				case 4:
					System.exit(0);
					
				default:
					System.out.println("invalid choice!!!");	
				}	
			}
			
		}
	}
}
