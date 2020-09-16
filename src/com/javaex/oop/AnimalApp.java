package com.javaex.oop;

public class AnimalApp {

	public static void main(String[] args) {
		Animal cat = new Cat("nana");
		Animal dog = new Dog("도기");
		((Cat)cat).meow();
		((Dog)dog).bark();
		
					
		
//		Cat c = (Cat)(new Animal("인간"));
//		c.walk();
//      ClassCastException
		
		Animal pet = new Dog("멍멍이");
		
		pet.eat();
		pet.walk();
		
		pet = new Cat("야옹이");
		pet.eat();
		pet.walk();
		
		
		System.out.println(pet instanceof Cat);
		
		
	}

}
