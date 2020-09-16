package com.javaex.oop.summary;

public class Panda extends Animal {

	protected Panda(String name) {
		super(name);
	}

	@Override
	public void say() {
		System.out.println(name + ": ....");
	}

}
