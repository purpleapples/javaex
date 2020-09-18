package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		// Thread import and run
		Thread thread = new DigitThread();
		thread.setName("digitThread");
				
		thread.start();
		
		Thread thread2 = new Thread(new AlphabetThread());
		thread2.start();
		
		// sub thread 흐름제어를 위해
		// sub thread 의 flow를 main thread 에 connect
		
		try {
			thread.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("[MainThread]:" + ch);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread 종료");
	}

}
