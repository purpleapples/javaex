package com.javaex.oop.summary;

public class SummaryApp {
	private static  Kungfu dojang[];
	public static void main(String[] args) {
		Human h1 = new Human("홍길동");
		Human h2 = new TheOne("Neo");
		Panda p1 = new Panda("핑");
		Panda p2 = new KungfuPanda("포");		
		Animal [] AnimalArr = new Animal[4];
		AnimalArr[0] = h1;
		AnimalArr[1] = h2;
		AnimalArr[2] = p1;
		AnimalArr[3] = p2;
		
		for (Animal mammal: AnimalArr) {
			fight(mammal);
			fly(mammal);
		}
		
		// 쿵후 도장에 등록
		dojang = new Kungfu[] {
				//h1, 
				(Kungfu)h2,
				//p1,
				(Kungfu)p2};
		for (Kungfu actor: dojang) {
			actor.kungfu();
		}
		
	}
	
	private static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			((Flyable)actor).fly();
		}else {
			System.out.println(actor.name + ": I can't fly");
		}
		
	}
	
	private static void fight(Animal actor) {
		
		if (actor instanceof Kungfu) {
			((Kungfu)actor).kungfu();
		}else {
			System.out.println(actor.name + ": 쿵후 못해요");
		}
		
	}

}
