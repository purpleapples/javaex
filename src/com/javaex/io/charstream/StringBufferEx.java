package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringBufferEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String fileName = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		Reader freader = null;
		BufferedReader br = null;
		try {
			freader = new FileReader(fileName);
			br = new BufferedReader(freader);
			
			String line = "";
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.println(token + " ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				freader.close();
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
