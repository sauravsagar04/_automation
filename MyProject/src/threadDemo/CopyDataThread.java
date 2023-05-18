package threadDemo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDataThread extends Thread {
	private InputStream input;
	private OutputStream output;
	public CopyDataThread(InputStream input, OutputStream output) {
		this.input = input;
		this.output = output;
		}
	public void run() {
		try {
			int count = 0;
			int data;
			while ((data = input.read()) != -1) {
				output.write(data); count++;
				if (count == 10) {
					System.out.println("10 characters are copied");
					count = 0;
					Thread.sleep(5000); }
				}
			input.close();
			output.close();
			}
		catch (IOException | InterruptedException e) {
			((Throwable) e).printStackTrace();
		}
		}
	}

