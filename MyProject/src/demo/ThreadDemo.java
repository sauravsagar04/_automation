package demo;


class DemoThread implements Runnable {
	public void run() {   // this was method of thread class we are just overriding
		for(int i=0;i<5;i++) {
			System.out.println("Thread started..."+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ThreadDemo {
	public static void main(String args[])  {
//		System.out.println(Thread.currentThread().getName());
		
//		DemoThread t1 = new DemoThread();
//		DemoThread t2 = new DemoThread();
//		t1.start();
//		t2.start();
//		t1.run();
		DemoThread obj = new DemoThread();
//		Runnable r1 = ()->System.out.println("Thread is running..");
		
		Thread t1 = new Thread(obj,"xyz");
		
		Thread t2 = new Thread(obj,"abc");
		Thread t3 = new Thread(obj,"def");
		t1.setPriority(Thread.MAX_PRIORITY);  //we cannot predict the priority based thread. 
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY-4);
		System.out.println("Thread.....->"+t1.getPriority());
		System.out.println("Thread.....->"+t2.getPriority());
		System.out.println("Thread.....->"+t3.getPriority());
		t1.start();
	
//		t1.interrupt();
		t2.start();
		
		t3.start();
	}

}
