package assignment;
import java.util.*;

public class Q2 {
	public static void main(String []args) {
		
		Scanner obj = new Scanner(System.in);

        String color = obj.nextLine();
        
        switch(color) {
        case "red":
        	System.out.println("Stop");
        	break;
        case "yellow":
        	System.out.println("Ready");
        	break;
        case "Green":
        	System.out.println("Go");
        	break;
        default:
        	System.out.println("Invalid");
        }
	}

}
