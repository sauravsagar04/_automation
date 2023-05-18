package threadDemo;

public class Account implements Runnable {
	private double balance = 25000;
	public synchronized void withdraw(String name , double amt) {
		if(amt < balance) {
			System.out.println(name +" going to withdraw "+amt);
			balance -= amt;
			System.out.println("withdraw completed........for "+name);
			System.out.println("Available BAlance ---> "+balance);
		}
		else {
			System.out.println(name+" have no enough balance");
		}
	}
	public void run() {
		withdraw(Thread.currentThread().getName(), 15000);
	}

}
