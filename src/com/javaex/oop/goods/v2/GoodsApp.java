package com.javaex.oop.goods.v2;


public class GoodsApp {

	public static void main(String[] args) {
		// use ref
		Goods notebook = new Goods();
		
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone SE");
		smartphone.setPrice(600000);
		
		// 출력
		System.out.printf("%s %d원%n",
				notebook.getName(), notebook.getPrice());
		// 출력
		System.out.printf("%s %d원%n",
				smartphone.getName(), smartphone.getPrice());
	}

}
