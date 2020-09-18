package com.javaex.io;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FileClassEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	// file 객체는 IO 작업을 수행하지 않고 Stream 이 처리
	public static void main(String[] args) {	
		// 파일 객체
		File root = new File(rootPath);
		// 파일 존재 여부 확인
		printInfo(root);
		
		if(!root.exists()) {
			root.mkdirs();
		}
		
		File myFile = new File(rootPath + "myFile.txt"); // file 미생성
		if(!myFile.exists()) {
			try {
				myFile.createNewFile();
			} catch (IOException e) {			
				System.err.println("파일 생성 실패");
				e.printStackTrace();
			}
		}
		
		// delete file
		
		myFile.delete();
		printInfo(root);
	}

	private static void printInfo(File f) {
		System.out.println("===========");
		
		if(f.isDirectory()) {
			System.out.println("Directory : " + f.getName());
			
			File[] files = f.listFiles();
			
			for (File file : files) {
				System.out.print(file.isDirectory() ? "d" : "f " + " : ");
				System.out.println(file.getName());
			}
		}else {
			System.out.println("File:" + f.getName());
		}
		System.out.println("===========\n");
	}
	
}
