package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferdCharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
	
		Reader reader;
		Writer writer;
		reader = null;
		writer = null;
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
			
			BufferedReader br = new BufferedReader(reader);
			BufferedWriter bw = new BufferedWriter(writer);
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				if(line.toUpperCase().contains("LEAF") ||
						line.toUpperCase().contains("LEAVES")){
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				} 
			}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {			 
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			} 
		}
		

	}

}
