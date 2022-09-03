//Java Program to Read a Grade and Display the Equivalent Description\

import java.util.Scanner;

public class Grade_Description {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		if(ch == 'A' || ch == 'a') {
			System.out.println("Student has got marks between above 80 out of 100.");
		}else if(ch == 'B' || ch =='b') {
			System.out.println("Student has got marks above 60 but less than equal to 80 out of 100.");
		}else if(ch == 'C' || ch == 'c') {
			System.out.println("Student has got marks above 40 but less than equal to 60 out of 100.");
		}else if(ch == 'D' || ch == 'd') {
			System.out.println("Student has failed");
		}else {
			System.out.println("Invalid Grade");
		}
	}

}
