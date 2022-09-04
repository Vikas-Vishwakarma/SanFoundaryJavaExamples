//Java Program to Extract Last Two Digits of a Given Year

package sanfoundary.dateTimeYear;

import java.util.Scanner;

public class Extract_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start Year: ");
		int year = sc.nextInt();
		sc.close();
		String s = "";
		int i = 0;
		while (i < 2) {
			int rem = year % 10;
			s = rem + "" + s;
			year = year / 10;
			i++;
		}
		System.out.println("Last Two Digits of year: " + s);
	}
}
