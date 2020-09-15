package com.javaex.oop.goods.v3;

// v3.필드를 Read Only로 변경 + 생성자 추가
public class Goods {
	
	private String name;
	private int price;
	
	// default Constructor
//	public Goods() {
//		
//	}
	public Goods(String name, int price) {
		// default constructor can be created by JVM
		this.name = name;
		this.price = price;
	}
	public void showInfo() {
		System.out.printf("%s %d원%n",this.name, this.price);
	}
	
//	public String getName() {		
//		return this.name;
//	}
//	
//	public int getPrice() {
//		return this.price;
//	}
//
//	public void setName(String string) {
//		this.name = string;		
//	}
//
//	public void setPrice(int i) {
//		this.price = i;		
//	}
//	

}
