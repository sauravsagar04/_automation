package assignment;

import java.util.Scanner;

public class Q10 {
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the day: ");
        int date = obj.nextInt();
        System.out.println("Enter the Month: ");
        int month = obj.nextInt();
        System.out.println("Enter the Year: ");
        int year = obj.nextInt();
        System.out.println("Entered Date => "+ date+":"+ month+":"+year);
        
        int leap = 0;
        if(year % 4 == 0) {
        	//condition for leap year
        	if(year % 100 == 0) {
        		if(year % 400 == 0)
        			leap = 1;	
        	}
        	else
        		leap = 1;		
        }
        
        switch(month) {
        case 01:
        }
        
        
        	
	}

}
