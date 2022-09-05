//Write a java program to print IP address of Local Host 
//InetAddress is a class which represents Internet Protocol IP address
//getHostAddress() method will provide IP Address

package sanfoundary.special;

import java.net.InetAddress;

public class Get_IPAddress {
	public static void main(String[] args) throws Exception {

		InetAddress IP = InetAddress.getLocalHost();

		System.out.println("IP Address: " + IP.getHostAddress());
	}
}
