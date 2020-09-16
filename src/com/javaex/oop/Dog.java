package com.javaex.oop;

public class Dog extends Animal{

	protected Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name + ": 멍멍!");
	}

}
