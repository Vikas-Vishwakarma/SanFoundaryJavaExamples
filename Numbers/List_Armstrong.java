package sanfoundary.Numbers;

import java.util.Scanner;

public class List_Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= number; i++) {
			int  count = 0, arm = 0;
			int t1 = i;
			while (t1 != 0) {
				t1 = t1 / 10;
				count++;
			}
//			System.out.println(count);

			int t2 = i;
			while (t2 != 0) {
				int rem = t2 % 10;
				int result = 1;
				for (int j = 1; j <= count; j++) {
					result = result * rem;
				}
				arm += result;
				t2 = t2 / 10;
			}

			if (arm == i) {
				System.out.print(i + " ");
			}
		}
	}

}
