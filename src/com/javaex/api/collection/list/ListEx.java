package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
//		List<String> lst = new LinkedList();		
		List<String> lst = new ArrayList<>();
		listTest(lst);
	}

	private static void listTest(List<String> lst) {
		// object add : add
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst " + lst);
		
		// insert
		lst.add(2, "c#");
		
		// allow duplication 
		lst.add("Java");
		System.out.println("lst : " + lst);
		
		// remove object
		// 1. with index
		lst.remove(2);
		// 2. with value : just one ahead 
		lst.remove("Java");
		System.out.println("lst : " + lst );
		
		Iterator<String> it = lst.iterator();
		
		while(it.hasNext()) {
			
			String item = it.next();
			System.out.println("item: " + item);
			
		}
	}

}
