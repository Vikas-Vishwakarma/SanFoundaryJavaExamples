package sanfoundary.dateTimeYear;

import java.util.Scanner;

public class Year_Month_Week_Day {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Days: ");
		int input = sc.nextInt();
		sc.close();
		
		calculateDay(input);
		calculateTime(input); 		
	}
	private static void calculateDay(double day){

 		System.out.println("Year: "+ Math.round(day/365));
 		System.out.println("Month: "+ 	Math.round(day/30.417));
 		System.out.println("Week: "+ Math.round(day/7));
	}
	
	private static void calculateTime(long day) {
		
		System.out.println("Hour: "+day*24);
 		System.out.println("Minute: "+ day*1440);
 		System.out.println("Second: "+day*86400);
	
	}
}
