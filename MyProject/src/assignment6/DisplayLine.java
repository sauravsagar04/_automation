package assignment6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class DisplayLine {
	public static void main(String []args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\t1. Input data into the file");
			System.out.println("\t2. Read and Display the data of the file");
			System.out.println("\t3.Exit");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the email");
				String email = sc.next();
				System.out.println("Enter the phone");
				long ph = sc.nextLong();
				File f = new File("D://NewFileIris/newfile4.txt");
				FileWriter fw = new FileWriter(f,true); // true will open the file in append mode
				fw.write(name+"  "+email+"  "+ph+"\n");
				System.out.println("\n");
				fw.close();
				break;
			case 2:
				FileReader fr = new FileReader("D://NewFileIris/newfile4.txt");
				BufferedReader br = new BufferedReader(fr);
				String data = null; 
				int count = 1;
				while((data = br.readLine())!= null) {
					System.out.println(count +". "+ data);
					count++;
				}
				System.out.println("\n");
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid option");	
			}
		}
		
	}
}
