package assignment;

import java.util.Scanner;

public class Q6 {
	public static void main(String []args) {
		System.out.println("Enter the number of lines for pattern print: ");
		Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        
        for(int i=0;i<num;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print("*\t");
        	}
        	System.out.print("\n");
        }
        
        
	}

}
