package com.javaex.network;


import java.io.IOException;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			
			// bind with address and port
			serverSocket = new ServerSocket();
			
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10002);
			serverSocket.bind(local);
			
			System.out.println("<server start>");
			System.out.println("[server: waiting for connection]");
			
			while(true) {
				Socket socket = serverSocket.accept();
//				Thread thread = new ServerThread(socket);
//				thread.start();
				new ServerThread(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				System.out.println("[server: sleep.....]");
			} 
		}
		System.out.println("<server terminated>");
	}

}
