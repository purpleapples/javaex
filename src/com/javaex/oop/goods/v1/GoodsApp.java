package com.javaex.oop.goods.v1;


public class GoodsApp {

	public static void main(String[] args) {
		// use ref
		Goods notebook = new Goods();
		
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		
		// 출력
		System.out.printf("%s %d원%n",
				notebook.name, notebook.price);
		// 출력
		System.out.printf("%s %d원%n",
				smartphone.name, smartphone.price);
	}

}
