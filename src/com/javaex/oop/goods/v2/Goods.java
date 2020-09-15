package com.javaex.oop.goods.v2;

// v2.encapsulation
public class Goods {
	private String name;
	private int price;
	
	public String getName() {		
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}

	public void setName(String string) {
		this.name = string;		
	}

	public void setPrice(int i) {
		this.price = i;		
	}
	

}
