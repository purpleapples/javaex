package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		
		consoleInput();
		consoleOutput();
	}
	
	public static void consoleInput() {
		Scanner scanner  = new Scanner(System.in);		
		System.out.println("what is your name ?");
		String name= scanner.next();
		System.out.println("how old are you ?");
		int age = scanner.nextInt();
		System.out.println("name : " + name + " age : " + age);
		scanner.close();
	}
	
	public static void consoleOutput() {
		// System.out : standard output
		// System.err : standard error
		// print : not new line
		// println : new line
		// printf : formatting output -> String is managing
		
		System.out.print("Hello");
		System.out.println("Java");
		System.out.println("Hello\nHava");
		System.out.println("Hello\tJava");
		String message = "Hello, \"Java\"";
		System.out.println(message);
		
		// in case of  window path seperator : \\
		String filename = "C:\\myfolder\\";
		
	}
}
