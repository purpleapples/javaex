package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String fileName = rootPath + "thieves.txt";
	public static void main(String[] args) {
		File file = new File(fileName); 
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			
			String name;
			float height;
			float weight;
			
			while(scanner.hasNextLine()) {
				name = scanner.next(); // 분절된 문자
				height = scanner.nextFloat();
				weight= scanner.nextFloat();				
				
				System.out.printf("%s - %.2f, %.2f %n", name, height, weight);
				scanner.nextLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				scanner.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
