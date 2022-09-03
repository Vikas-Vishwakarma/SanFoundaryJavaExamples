//Java Program to Find the Number of Integers Divisible by 5

package sanfoundary.Simple;

import java.util.Scanner;

public class DivisblebyFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
//		Divible by 5 
		for(int i=1;i<=number;i++) {
			if(i % 5 == 0) {
				System.out.println(i+" is divisble by 5.");
			}
		}
		
		// Write a java program
		//1. Take input from User (Till the Number)
		// 2. Take divisior from User
//		int div = sc.nextInt();
		sc.close();
//		for(int i=1;i<=number;i++) {
//			if(i % div == 0) {
//				System.out.println(i+" is divisble by "+div+".");
//			}
//		}
 	}
}


