package assignment;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		int a = 1;
		int b = 1;
		
		Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n == 1 || n == 2)
        	System.out.println(n+"th" + "Fibonacci is: 1");
        else {
        	int c = 0;
        	for(int i=2;i<n;i++) {
        		c = a + b;
        		a = b;
        		b = c;
            }
        	System.out.println(n+"th" + " Fibonacci is: " + c);
        }
        
        
        System.out.println(n+"th" + " Fibonacci using recursion: ");
		Q3 obj1 = new Q3();
		System.out.print(obj1.recfib(n));
		
	}
	
	public int recfib(int n) {
		if(n == 1 || n == 2)
			return 1;
		else
			return recfib(n-1) + recfib(n -2);
	}
	

}
