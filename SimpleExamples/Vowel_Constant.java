//Java Program to Check Whether a Character is a Vowel, Consonant

import java.util.Scanner;

public class Vowel_Constant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		//Vowel AEIOU or aeiou
		
		if(ch == 'A' || ch == 'a' || ch == 'E'|| ch == 'e'|| ch == 'I'|| ch == 'i'|| ch == 'O'|| ch == 'o'|| ch == 'U'|| ch == 'u') {
			System.out.println(ch+" is Vowel.");
		}else {
			System.out.println(ch+" is Consonant.");
		}
		
	}
}
