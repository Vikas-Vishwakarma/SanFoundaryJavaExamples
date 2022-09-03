//Write a java program to print MUltiplication Table

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+ i+" = "+n*i);
		}
	}

}
