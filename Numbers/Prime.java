//Java Program to Find Prime Numbers in a Given Range

package sanfoundary.Numbers;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		
		primeNumber(number);
		
	}
	public static void primeNumber(int n) {
		boolean flag = false;
		if(n == 0 || n ==1) {
			System.out.println(n+" is not a Prime Number");
		}else {
			//Outer to Iterate Number of Iterations
			for(int i=2;i<=n;i++) {
				//Inner loop to divide i till i-1
				for(int j=2;j<=i-1;j++) {
					if(i%j == 0) {
						flag = true;
					}
				}
				
				if(flag == false) {
					System.out.print(i+" ");
				}else {
					flag = false;
				}
			}
		}
			
	}
}
