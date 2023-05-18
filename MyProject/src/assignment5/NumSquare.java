package assignment5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Sq {
	Map<Integer, Integer> getSquare(int[] arr) {
		int n = arr.length;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			if(!m.containsKey(arr[i])) {
				m.put(arr[i], arr[i]*arr[i]);
			}
		}
		return m;
	}
}

public class NumSquare {
	public static void main(String []args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of Array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Sq s = new Sq();
		System.out.println(s.getSquare(arr));
		sc.close();
	}

}
