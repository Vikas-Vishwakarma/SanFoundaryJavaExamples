package sanfoundary.special;

import java.util.*;

public class AtmOperations {

	// Assuming this all are the bank provided Details
	private static String Name = "Vikas Vishwakarma";
	private static int balance = 20000;
	private static boolean flag = true;
	// Password should be visible to others. We will change all this Using OOPS
	// Concept. Stay Tuned
	private static int password = 9765;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Some Bank Name");
		System.out.println("Enter Password: ");
		int count = 0;
	
		boolean flag1 = false;
		while (flag == true) {
			
			// using Do while Loop to for 3 attempt password check
			do {
				flag1 = true;
				int pass = sc.nextInt();
				count++;
				if (pass == password) {
					System.out.println("----------------------------------------------------------Welcome----------------------------------------------------------");
					System.out.println(Name);
					chooseOption();
				} else {
					if (count == 3) {
						System.out.println("Your Account has been terminated. Please contact with bank.");
						flag1 = true;
						flag = false;

					} else {
						System.out.print("Enter Correct Password: ");
					}
				}
				flag1 = true;
			} while (flag1 == false);

			if (flag == true) {
				flag1 = true;
				System.out.println("Do you want to exit (Press 1 to exit): ");

				int check = sc.nextInt();
				if (check == 1) {
					flag = false;
					System.out.println("Logged Out :)");
				} else {
					chooseOption();
				}
			}
		}
	}

	private static void chooseOption() {
		System.out.print("""
				1. Check User Detail
				2. Check Balance
				3. Withdraw Money
				4. Deposit Money
				5. Change Pin
				6. Cancel
				7. Exit
				""");
		int n = sc.nextInt();
		if (n == 1) {
			userDetail();
		} else if (n == 2) {
			checkBalance();
		} else if (n == 3) {
			System.out.println("Enter Amount to Withdraw: ");
			int amount = sc.nextInt();
			withdrawMoney(amount);
		} else if (n == 4) {
			System.out.println("You can deposit only 5000 at a time.");
			System.out.println("Enter Amount to Deposit: ");
			int amount = sc.nextInt();
			depositMoney(amount);
		} else if (n == 5) {
			changePin(9765);
		} else if (n == 6) {
			cancel();
		} else if (n == 7) {
			flag = exit();
		} else {
			System.out.println("Thank You.");
			flag = false;
		}
	}

	private static void userDetail() {
		System.out.println("Name : " + Name + """
				Phone Number: 95552707325
				Account Number: 12312718419
				Account Type: Current
				""" + "Balance: " + balance);
	}

	private static void checkBalance() {
		System.out.println("Hi, " + Name);
		System.out.println("Balance: " + balance);
	}

	private static void withdrawMoney(int amount) {
		System.out.println("Hi, " + Name);
		if (amount > balance) {
			System.out.println("Low Balance.");
		} else {
			if (amount > balance - 2000) {
				System.out.println("Low Balance.");
			} else {
				balance -= amount;
				System.out.println("Please Collect Your Cash.");
				System.out.println("Updated Balance: " + balance);
			}
		}
	}

	private static void depositMoney(int amount) {

		if (amount >= 5000) {
			System.out.println("You can deposit only 5000 at a time.");
		} else {
			balance += amount;
			System.out.println("Updated Balance: " + balance);
		}
	}

	private static void changePin(int pass) {
		System.out.println("Enter Password: ");
		int ans = sc.nextInt();
		if (ans == pass) {
			System.out.print("Enter Your new Password: ");
			pass = sc.nextInt();
			System.out.println("Hi, " + Name + "Your password has been changed successfully.");
		}
	}

	private static void cancel() {
		chooseOption();
	}

	private static boolean exit() {

		System.out.println("Thank You.");
		return false;
	}
}
