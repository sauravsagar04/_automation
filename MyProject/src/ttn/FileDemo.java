package ttn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String []args) throws IOException {
//		File f = new File("D://NewFileIris/newfile.txt");
//		f.renameTo(new File("D://NewFileIris/newfile2.txt"));
//		f.createNewFile();
//		f.mkdir();
		
		
//		if(f.exists()) {
//			f.delete();
//			System.out.println("file is deleted");
//		}
//		else {
//			f.createNewFile();
//		}
			
		
//		File f = new File("D://NewFileIris");	
//		String fname[] = f.list();
//		for(String s:fname) {
//			File f1 = new File(f,s);
//					if(f1.isFile())
//						System.out.println(s);
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name");
//		String name = sc.next();
//		System.out.println("Enter te email");
//		String email = sc.next();
//		System.out.println("Enter the phone");
//		long ph = sc.nextLong();
//		File f = new File("D://NewFileIris/newfile3.txt");
//		
//		FileWriter fw = new FileWriter(f,true); // true will open the file in append mode
//		fw.write(name+"\t"+email+"\t"+ph+"\n");
//		fw.close();   //fw.flush() will also work it will save the file.
//		System.out.println("DOne....");
//		sc.close();
		
//		char [] c = new char[10];
//		FileReader fr = new FileReader("D://NewFileIris/newfile3.txt");
//		int data = fr.read(c);
		
//		int data = 0;
//		while((data = fr.read())!= -1)
//			System.out.println((char)data);  //it will print the whole data
		
		
//		BufferedReader br = new BufferedReader(fr);
//		String data = br.readLine(); // only for single line
		
		
//		String data = null; //we have to include the null
//		while((data=br.readLine())!= null)  // for the whole data
		
//	

		byte b[] = new byte[1634518];
		FileInputStream fis = new FileInputStream("D://b.mp3");
		fis.read(b);
		FileOutputStream fos = new FileOutputStream("D://new.mp3",true);
		fos.write(b);
		fos.close();
		System.out.println("Done........");
		
	}

}
