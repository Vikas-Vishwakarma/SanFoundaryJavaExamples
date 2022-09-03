package sanfoundary.Simple;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd: ");
		int number = sc.nextInt();
		sc.close();
		
		if(number % 2 == 0) {
			System.out.println(number + " is Even Number.");
		}else {
			System.out.println(number + " is Odd Number.");
		}
	}
}
