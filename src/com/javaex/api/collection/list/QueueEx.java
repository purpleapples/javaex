package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// provide several data
		for (int i = 0; i < 11; i++) {
			queue.offer(i);
		}
		
		System.out.println(queue);
		
		int peek = queue.peek();
		System.out.println("peek : " + peek);
		
		System.out.println("queue : " + queue);
		
		// poll -> empty() check
		while (!queue.isEmpty()) {
			System.out.println("poll : " + queue.poll());
			System.out.println("queue : " + queue);
			
		}
	}

}
