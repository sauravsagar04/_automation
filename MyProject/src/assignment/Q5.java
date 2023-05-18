package assignment;
import java.util.*;

public class Q5 {
	public static void main(String args[]) {
        System.out.println("Enter Matrix Size: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        display(arr, n, m);
    }
    public static void display(int[][] arr, int n, int m) {
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

}
