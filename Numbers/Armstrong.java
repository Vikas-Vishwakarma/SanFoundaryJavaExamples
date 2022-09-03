//Write a Java Program to check if the Given Number is Armstrong Number or not.

package sanfoundary.Numbers;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		sc.close();
		int t1 = number, count=0, arm =0;
		while (t1 !=0) {
			t1 = t1/10;
			count++;
		}
		System.out.println(count);
		
		int t2 = number;
		while(t2 !=0) {
			int rem = t2%10;
			int result = 1;
			for(int i=1;i<=count;i++) {
				result = result * rem;
			}
			arm +=result;
			t2 = t2/10;			
		}
		
		if(arm == number) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
