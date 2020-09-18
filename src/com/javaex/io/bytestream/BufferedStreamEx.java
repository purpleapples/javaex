package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String src = rootPath + "img.jpg";
	private static String tgt = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			// 보조 스트림은 주스트림에 부가적인 기능을 추가하기 위한 클래스
			// IO 작업 수행은 주 스트림이 행한다.
			
			// 주 스트림
			InputStream is = new FileInputStream(src);
			OutputStream os = new FileOutputStream(tgt);
			

					
			// 보조 스트림 : 주 stream으로 부터 stream 생성
			 
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			
			byte[] data = new byte[10240];
			int size = 0;
			
			while((size=bis.read(data)) != -1) {
				bos.write(data);
				System.out.println(size + " byte transport");
			}

			System.out.println("파일을 복사했습니다.");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bos.flush();
				bos.close();
				bis.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
