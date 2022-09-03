//Java Program to Check Whether a Number is Positive or Negative

package sanfoundary.Simple;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check Positive or Negative: ");
		int n = sc.nextInt();
		sc.close();

		if(n > 0) {
			System.out.println(n+" is Positive Number.");
		}else if(n < 0){
			System.out.println(n+" is Negative Number.");
		}else {
			System.out.println(n+" is Zero Number.");
		}
	}
}
