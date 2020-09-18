package com.javaex.thread.synchronize;

// 여러 thread가 공용으로 사용할 객체
public class SharedMemory {
	// 필드 
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 임계영역 : 멀티 thread 프로그램에서 단 하느이 thread 만 실행할 수 있는 코드 영역
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
