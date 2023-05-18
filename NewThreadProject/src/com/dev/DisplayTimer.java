package com.dev;

public class DisplayTimer implements Runnable{
	 private int seconds;

	 public DisplayTimer() {
	    this.seconds = 0;
	 }
	 @Override
	 public void run() {
	    while (true) {
	        try {
	             for(int i=0;i<10;i++) {
	            	 this.seconds += 1;
	            	 Thread.sleep(1000);
	            	 System.out.println("Timer: " + this.seconds + " seconds");
	             }

	             this.seconds = 0;
	             System.out.println("Timer: " + this.seconds + " seconds");
	        } 
	        catch (InterruptedException e) {
	             System.out.println("Timer interrupted");
	             return;
	        }
	   }
	}
	public static void main(String[] args) {
	    DisplayTimer t = new DisplayTimer();
	    Thread th = new Thread(t);
	    th.start();
	}

}
