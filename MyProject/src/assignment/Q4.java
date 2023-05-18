package assignment;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println("Prime Numbers are: ");
        for(int i=1;i<num;i++) {
        	int flag = 0;
        	for(int j=1;j<i;j++) {
        		if(i%j == 0)
        			flag++;
        	}
        	if(flag == 1)
        		System.out.print(i + "\t");
        }
	}

}
