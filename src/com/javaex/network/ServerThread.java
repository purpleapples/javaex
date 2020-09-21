package com.javaex.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket socket = null;
	
	public ServerThread(Socket socket) {
		this.socket =socket;
	}
	@Override
	public void run() {

		try {

			
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
						
			System.out.println("[server: a new client has been connected.]");
			System.out.println("connected client info : " + socketAddress.getAddress() + " : " + socketAddress.getPort());
			
			
			
			// input stream pipe
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// output Stream pipe
			OutputStream os = socket.getOutputStream();
			Writer ows = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ows);
			
			// message 일고 Echo Back
			while(true) {
				String msg = br.readLine();
				
				if(msg == null) {
					System.out.println("[server: client connection terminated]");
					break;
				}
				System.out.println("[server: client message : ]" + msg);
				// Echo Back
				System.out.println("[server: Echo Back]");
				bw.write("[Echo Message] " + msg);
				bw.newLine();
				bw.flush();
				
			}
			
			bw.close();
			br.close();			
			super.run();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
