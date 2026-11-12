package practiceProgram;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Balance : ");
		double balance = sc.nextDouble();

		System.out.println("enter Withdrawal Amount : ");
		double amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount");
		} else if (amount % 100 != 0) {
			System.out.println("Amount must be multiply of 100");
		} else if (amount > balance) {
			System.out.println("Insufficient balance...!");
		}else {
			balance=balance-amount;
			System.out.println("Withdrawal Successful...!");
			System.out.println("Remaining balance : Rs. " +balance);
		}
		sc.close();
	}

}
