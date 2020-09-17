package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// vector create
		Vector<Integer> v = new Vector<>();
		System.out.println("Size:" + v.size() + ", 버퍼 공간 : " + v.capacity());
		
		// 1부터 10까지 값을 담아봅니다.
		for (int i = 0; i < 11; i++) {
			v.addElement(i);
		}
		System.out.println("Size:" + v.size() + ", 버퍼 공간 : " + v.capacity());
		v.addElement(11);
		System.out.println("Size:" + v.size() + ", 버퍼 공간 : " + v.capacity());
		
		// 중간에 값을 삽입
		v.insertElementAt(21, 3);
		
		System.out.println("Size:" + v.size() + ", 버퍼 공간 : " + v.capacity());
		
		// index value search : elementAt
		System.out.println("object at 3 index: " + v.elementAt(3));
		
		// object search : indexOf()
		
		System.out.println("index of a certian object : " + v.indexOf(21));
		
		//contains object ? : contains();
		
		System.out.println("index of a certian object : " + v.contains(21));
		
		// remove object at a certain index : remove();
		System.out.println("before remove : " + v);
		System.out.println("index of a certian object : " + v.remove(3));
		System.out.println("after remove : " + v);
		
		
		// loop
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.printf("%d번 element %d%n", i, item);
		}
		
		// recommend Enumeration rather then loop 
		
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) { //confirm
			Integer item = e.nextElement();
			System.out.println(item);
		}
		
		// Generics 활용
		
		Vector<? super Number> v2 = new Vector<>();
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement("java"); // String은 Number의 후손이 아니다.
	}

}
