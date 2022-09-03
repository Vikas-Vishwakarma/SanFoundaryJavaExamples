//Java Program to Print Binary Equivalent of an Integer

import java.util.Scanner;

public class Binary_To_Decimal {
	public static void main(String[] args) {
		// Binary to decimal Conversion
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Digit: ");
		String binary_Digit = sc.next();
		sc.close();
		// Easy Way
		System.out.println(Integer.parseInt(binary_Digit, 2));

		// Different way
		int binary = 10101;
		getDecimal(binary);
	}

	public static void getDecimal(int binary) {

		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		System.out.println(decimal);
	}
}