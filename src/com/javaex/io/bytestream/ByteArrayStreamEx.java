package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
	
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outTarget = null;
		try {
			 
			InputStream bis = new ByteArrayInputStream(inSrc);
			
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0;
			System.out.println("input array : " + Arrays.toString(inSrc));
			while((data= bis.read()) != -1 ) {
				System.out.println("Read Data  " + data);
				bos.write(data);
			}				
			outTarget = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("target array :  " + Arrays.toString(outTarget));
			} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	
	

}
