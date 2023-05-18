package threadDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileThread {
	public static void main(String[] args) {
		try { 
			FileInputStream input = new FileInputStream("D:\\NewFileIris\\source.txt");
			FileOutputStream output = new FileOutputStream("D:\\NewFileIris\\target.txt");
			CopyDataThread thread = new CopyDataThread(input, output);
			thread.start();
		}
		catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
	}
}

