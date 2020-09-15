package com.javaex.oop.goods.v4;

// v4. 자신의 다른 생성자를 호출
public class Goods {
	
	private String name;
	private int price;
	private String option;
	// default Constructor
//	public Goods() {
//		
//	}
	public Goods(String name, int price) {
		// default constructor can be created by JVM
		this.name = name;
		this.price = price;
	}
	
	
	public Goods(String name, int price, String option) {
		this(name, price);
		this.option = option;
		
		
	}
	
	public void showInfo() {
		System.out.printf("상품명 : %s%n",this.name);
		System.out.printf("가격 : %d%n",this.price);
		if (option != null)
			System.out.println("옵션: " + this.option);
	}


	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}
	
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
