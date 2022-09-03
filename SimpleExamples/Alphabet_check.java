//Java Program to Check Whether a Given Alphabets are Uppercase or Lowercase or Digits

import java.util.Scanner;

public class Alphabet_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		if(ch >= 97 && ch <= 123) {
			System.out.println(ch+" is Lower Case.");
		}else if(ch >= 65 && ch <= 96) {
			System.out.println(ch+" is Upper Case");
		}else if(ch >=48 && ch <= 57) {
			System.out.println(ch+" is Digit");
		}else {
			System.out.println("Invalid Input");
		}
	}

}
