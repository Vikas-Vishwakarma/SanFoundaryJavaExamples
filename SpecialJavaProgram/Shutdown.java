//Write a java Program to Shutdown Your Computer

package sanfoundary.special;

import java.io.IOException;

public class Shutdown {

	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		try {
			System.out.println("Shutting down the PC after 5 seconds.");
			runtime.exec("shutdown -s -t 5");
		} catch (IOException e) {
			System.out.println("Exception: " + e);
		}
	}
}