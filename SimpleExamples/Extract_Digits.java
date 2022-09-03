package sanfoundary.Simple;

import java.util.Scanner;

public class Extract_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = sc.nextInt(); 		
		sc.close();
		
		int count = 0, num = number;	
		while(number > 0) {
			number = number/10;
			count++;
		}
		
		while(num > 0) {
			int val = num % 10;
			System.out.println(count+"th Position :"+val+" ");
			num = num/10;
			count--;
		}
		
	}

}
