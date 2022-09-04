//Java Program to Check Whether a given Year is a Leap Year

package sanfoundary.dateTimeYear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start Year: ");
		int startYear = sc.nextInt();
		System.out.print("\nEnter End Year: ");
		int endYear = sc.nextInt();
		sc.close();
		leapYearList(startYear, endYear);
		
		
		
		//Leap Year Logic		
//		if(year % 4 == 0 || year % 400 == 0 && year % 100 ==0) 
//			System.out.println(year+" is a Leap Year :)");
//		else 
//			System.out.println(year+" not a Leap Year :(");
	}
	
	public static void leapYearList(int startYear, int endYear) {
		for(int i = startYear; i <= endYear;i++) {
			if(i % 4 == 0 || i % 400 == 0 && i % 100 ==0) 
				System.out.println(i+" is a Leap Year :)");
			else 
				System.out.println(i+" not a Leap Year :(");
		}
	}
}
