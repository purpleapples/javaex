package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, ClassRoom> ht = new Hashtable<>();
		
		// insert data into map
		ht.put("J101", new ClassRoom("Java", "101"));
		ht.put("C202", new ClassRoom("C", "202"));
		ht.put("P303", new ClassRoom("Python", "303"));
		ht.put("L404", new ClassRoom("Linux", "404"));
		
		System.out.println("강의장 목록 : " + ht);
		
		// get data from map
		
		System.out.println("P303 과목의 강의장:" + ht.get("P303"));
		
		
		// check key : containsKey()
		System.out.println("Key L404 exist ? " + ht.containsKey("L404"));
		
		// check value : containsValue()
		System.out.println("Java 강의실 확인 : " + ht.containsValue("Java"));
		System.out.println("Java 강의실 확인 : " + ht.containsValue(new ClassRoom("Java")));
		
		// Iterator
		
		Iterator<String> it = ht.keySet().iterator();
		
		while(it.hasNext()) {
			ClassRoom room = ht.get(it.next());
			System.out.println("클래스룸 " + room);
		}
		ht.clear();
		System.out.println("map:" + ht);
	}

}
