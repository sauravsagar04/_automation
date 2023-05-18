package com.dev;
public class DisplayNum implements Runnable {
	private int num;
	private boolean isEven;
    public DisplayNum(boolean isEven) {
        this.num = 20;
        this.isEven = isEven;
    }
    @Override
    public void run() {
        for (int i = 1; i <= num; i++) {
            if (isEven && i % 2 == 0) {
                System.out.println("Even:  "+"\t\t"+i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            } else if(!isEven && i % 2 != 0){
                System.out.println("Odd: "+"\t\t"+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("Program Starts");
        System.out.println("***************");
        System.out.println("NumberType       Number");
        System.out.println("------------    ---------");
        Thread evenTh = new Thread(new DisplayNum(true));
        Thread oddTh = new Thread(new DisplayNum(false));
        evenTh.start();
        oddTh.start();
        evenTh.join();
        oddTh.join();
        System.out.println("Program Ends");
        System.out.println("***************");
    }

}
