package assignment2;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        SecondSmallest sec = new SecondSmallest();
        System.out.println("Second Samllest Number in Array : "+sec.getSecondSmallest(arr));
        obj.close();

	}
	
	int getSecondSmallest(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		return arr[1];
		
	}

}
