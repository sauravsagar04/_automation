package assignment5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class SS {
	int getSecondSmallest(Integer[] arr) {
		List<Integer> l = new ArrayList<>(Arrays.asList(arr));
		Collections.sort(l);
		return l.get(1);
	}
}

public class SecondSmallest {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = sc.nextInt();
		Integer [] arr = new Integer[n];
		System.out.println("Enter the elements of Array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		SS s = new SS();
		System.out.println("Second Smallest Element: "+s.getSecondSmallest(arr));	
		sc.close();
	}

}
