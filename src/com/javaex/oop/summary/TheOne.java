package com.javaex.oop.summary;

// 여러개 interface implement 가능
public class TheOne extends Human implements Kungfu, Flyable {

	protected TheOne(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(name + ": I believe I can fly");
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know Kungfu!");
	}

}
