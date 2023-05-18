package threadDemo;

class MyThread implements Runnable {
	public static void printMessage(String name) {
		synchronized(MyThread.class) {
		for(int i=0;i<5;i++) {
			System.out.println("Thread started..."+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		} 
		System.out.println("End of method ");
	}
	public void run() {
		printMessage(Thread.currentThread().getName());
	}
}
public class SyncDemo {
	public static void main(String args[]) {
		MyThread obj = new MyThread();
//		MyThread obj2 = new MyThread();
//		MyThread obj3 = new MyThread();
		Thread t1 = new Thread(obj,"A");
		Thread t2 = new Thread(obj,"B");
		Thread t3 = new Thread(obj,"C");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
