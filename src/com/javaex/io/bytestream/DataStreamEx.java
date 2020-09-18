package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class DataStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;
		try {
			os = new FileOutputStream(filename);
			dos = new DataOutputStream(os);
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.5F);
			
			dos.writeUTF("임꺽정");
			dos.writeBoolean(false);
			dos.writeInt(30);;
			dos.writeFloat(99.9F);
			
			dos.close();
			
			is = new FileInputStream(filename);
			dis = new DataInputStream(is);
			
			for (int i = 0; i < 2; i++) {
				
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s -%b:%d:%f%n", s, b, val, f);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
				dos.close();
				is.close();
				dis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}

	}

}
