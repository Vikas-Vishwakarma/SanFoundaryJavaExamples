//Write a Java Program to Find the Sum of Even and Odd Numbers

package sanfoundary.Simple;

import java.util.Scanner;

public class Sum_Odd_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Values in Array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}		
		sc.close();
		
		sum(arr);
	}
	
	public static void sum(int[] arr) {
		int sumEven = 0;
		int sumOdd = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				sumEven += arr[i];
			}else {
				sumOdd += arr[i];
			}
		}
		
		System.out.println("Sum of Even Number: "+sumEven);
		System.out.println("Sum of Odd Number: "+sumOdd);

	}
}
