//Java Program to Reverse a Number and Find its Sum using do-while Loop

import java.util.Scanner;

public class Sum_Reverse_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Program to Reverse a Number and Find its Sum using do-while Loop");
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		int sum =0;
		
		do {
			int rem = n% 10;
			sum += rem;
			n = n/10;
		}while(n > 0);
		
		System.out.println(sum);
		
	}

}
