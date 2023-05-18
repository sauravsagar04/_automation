package assignment5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Count{
	Map<Character, Integer> countChars(char[] arr) {
		int n = arr.length;
		Map<Character, Integer> mi = new HashMap<Character, Integer>();
		for(int i=0;i<n-1;i++) {
			if(mi.containsKey(arr[i])) {
				mi.put(arr[i], mi.get(arr[i])+1);
			}
			else {
				mi.put(arr[i], 1);
			}
		}
		return mi;
	}
}
public class CountChar {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Char Array Size: ");
		int n = sc.nextInt();
		char[] arr = new char[n];
		System.out.println("Enter the Elements of Char Array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.next().charAt(0);
		}	
		Count co = new Count();
		System.out.println(co.countChars(arr));
		sc.close();
	}
}


//charAt(0) -> to get the first char of the user input string,
//assuming that the user will only enter one character for each element.
