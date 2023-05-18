package assignment2;

import java.util.*;

public class AlphaSort {
	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String [] arr = new String[n];
        for(int i=0;i<n;i++) {
        	arr[i] = obj.next();
        }
        
        sortStrings(arr);
        for(String s: arr)
        	System.out.print(s+" ");
    
        obj.close();	
	}
	
	public static String[] sortStrings(String[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
        System.out.println("Sorted String array: ");

		int mid = (n + 1) / 2;
		for(int i=0;i<n;i++) {
			if(i < mid)
				arr[i] = arr[i].toUpperCase();
			else
				arr[i] = arr[i].toLowerCase();		
		}
		return arr;
	}
}
