///Write a java Program to print Fibonacci of a given number
//0 1 1 2 3 5 8 13

package factorialandFibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.print("0 1 ");
		
		int val1 = 0, val2 = 1, count = 2;
		while(count < n) {
			int sum = val1 + val2;
			System.out.print(sum+" ");
			val1 = val2;
			val2 = sum;
			count++;
		}
	}
}
