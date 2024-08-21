package com.thread.examples;

class Threadm implements Runnable{
	
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {				
				
				System.out.println(Thread.currentThread().getName()+ " - " + i);
				//Thread.yield();
				Thread.sleep(500);
			}
		} catch (InterruptedException obj) {
			obj.printStackTrace();
		}
		
	}
}


public class YieldDemo {

	public static void main(String[] args) {
		Threadm tc = new Threadm();
		Thread t1 = new Thread(tc);
		Thread t2 = new Thread(tc);
		Thread t3 = new Thread(tc);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main Thread");
		try {
			for (int i = 1; i <= 5; i++) {				
				System.out.println(Thread.currentThread().getName()+ " - " + i);
				Thread.yield();
				Thread.sleep(500);
			}
		} catch (InterruptedException obj) {
			obj.printStackTrace();
		}
		System.out.println("MainFinished");
	}

}
