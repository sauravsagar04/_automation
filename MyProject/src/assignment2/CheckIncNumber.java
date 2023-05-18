package assignment2;

import java.util.Scanner;

public class CheckIncNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
      
        CheckIncNumber chk = new CheckIncNumber();
        if(chk.checkNumber(number) == true)
        	System.out.println(number+" is increasing");
        else
        	System.out.println(number+" is not increasing");
        obj.close();
        	
	}
	
	boolean checkNumber(int number) {
		int last = number % 10;
		number = number / 10;
		while(number > 0) {
			int seclast = number % 10;
			if(last < seclast) {
				return false;
			}
			last = seclast;
			number = number / 10;
		}
		return true;
	}

}
