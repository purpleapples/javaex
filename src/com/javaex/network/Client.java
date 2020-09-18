package com.javaex.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

		public static void main(String args[]) {
			Socket socket = null;
			try {
				
				socket = new Socket();
				System.out.println("< new client start>");
				System.out.println("[client: request new connection]");
				
				InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10002); // server address
				
				socket.connect(remote);
				System.out.println("[client: connected]");
				
				// Stream 이용 서버로 메시지 전송
				OutputStream os = socket.getOutputStream(); // 주 스트림
				Writer osw = new OutputStreamWriter(os, "UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				
				InputStream is = socket.getInputStream();
				Reader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				// 키보드 입력을 위한 스캐너
				Scanner scanner = new Scanner(System.in);
				
				while (true) {
					String msg = scanner.nextLine(); // 한 줄 입력
					
					if(msg.equals("/q")) break;
					
					bw.write(msg);
					bw.newLine();     
					bw.flush();
					System.out.println("[client: message send | ] " + msg);
					
					// accept response message
					String rcvMsg = br.readLine();
					System.out.println("[clinet: message receive | ]" + rcvMsg);									
				}
				scanner.close();
				br.close();
				bw.close();				
				System.out.println("<client terminate>");
			}catch(ConnectException e) {
				e.printStackTrace();
			
			}catch(IOException e) {
				e.printStackTrace();
			
			}finally {
				
				try {
					socket.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
}
