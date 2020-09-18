package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP Address:" + local.getHostAddress());
			String domain = "www.google.com";
			InetAddress[] adres = InetAddress.getAllByName(domain);
//			System.out.println("Google IP address: " + Arrays.toString(adres));
			
			for (InetAddress inetAddress : adres) {
				System.out.println(domain + " IP Address: " + inetAddress);
			} 
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
