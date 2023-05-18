package threadDemo;

public class HelloWorld {
	public static void main(String args[]) {
		Account acc = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		Thread t1= new Thread(acc,"iris");
		Thread t2= new Thread(acc2,"sid");
		Thread t3= new Thread(acc3,"tim");
		
		t1.start();
		
		t2.start();
		t3.start();
	}

}
