package assignment2;

import java.util.Scanner;

public class Div35 {

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("Sum of natural nos divisible by 3 and 5: ");
        Div35 cal = new Div35();
        System.out.println(cal.calculateSum(n));
        obj.close();
        

	}
	
	int calculateSum(int n) {
		int sum =0;
		for(int i=1;i<=n;i++) {
			if(i%3 == 0 || i%5==0)
				sum = sum + i;
		}
		return sum;
	}

}
