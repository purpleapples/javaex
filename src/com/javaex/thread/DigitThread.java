package com.javaex.thread;

public class DigitThread extends Thread{

	
	@Override
	public void run() {
		for (int i = 0; i < 21; i++) {
			System.out.printf("[%s]:%d%n", getName(),i);

			try {
				Thread.sleep(200);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}
}
