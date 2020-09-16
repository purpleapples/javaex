package com.javaex.oop.summary;

public class Human extends Animal {

	protected Human(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void say() {
		System.out.println("안녕, 나는" + name + "이야");
	}

}
