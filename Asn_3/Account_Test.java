package Asn_3;

/**
 * Created by ZaidK on 15-02-07.
 */

// Name: Zaid Kaleem
// ID: 103619897
// Lab 3 | Part 1 - Problem 2

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Account_Test {
	public static void main(String args []){

		// Variable declarations
		int choice;
		double deposit, withdraw;
		String address = null, name = null;
		String sinNumber = null;

		Account myAccount = null;

		// Object declaration for Scanner object
		Scanner input = new Scanner(System.in);

		do {
			// Main Menu
			System.out.println("\n** Main Menu **");
			System.out.println("\t1) Create Account");
			System.out.println("Account Information: (An account must exist!)");
			System.out.println("\t2) Change Name");
			System.out.println("\t3) Change Address");
			System.out.println("Account Balance: (An account must exist!)");
			System.out.println("\t4) Check Funds");
			System.out.println("\t5) Add Funds");
			System.out.println("\t6) Withdraw Funds");
			System.out.println("Enter 0 to logout");
			System.out.printf("Your Choice --> : ");

			// Scanning Input
			choice = input.nextInt();

			switch (choice) {
				case 1:
					// Getting customer's name
					System.out.printf("Please enter your first name: ");
					String firstName = input.next();

					System.out.printf("Please enter your last name: ");
					String lastName = input.next();

					name = firstName + " " + lastName;

					// Getting customer's SIN number
					System.out.printf("Please enter your 9-Digit SIN number: ");
					sinNumber = input.next();

					// Getting customer's address
					address = JOptionPane.showInputDialog("Please enter your address");

					// Creating object of Account class type
					if (name != null && sinNumber != null && address != null)
						myAccount = new Account(name, address, sinNumber);
				break;

					// Change Name
				case 2:
					System.out.printf("Updating account name -- Enter Name: ");
					name = input.next();
					myAccount.setName(name);
					break;

				// Change Address
				case 3:
					address = JOptionPane.showInputDialog("Updating address -- Enter address");
					myAccount.setAddress(address);
					break;

				// Check Funds
				case 4:
					myAccount.checkFunds();
					break;

				// Add Funds
				case 5:
					System.out.println("Adding Funds -- Please enter amount: ");
					deposit = input.nextDouble();
					myAccount.addFunds(deposit);
					break;

				// Withdraw Funds
				case 6:
					System.out.println("Withdrawing Funds -- Please enter amount:");
					withdraw = input.nextDouble();
					myAccount.withdrawFunds(withdraw);
					break;

				default:
					System.out.printf("Logged Out\n");
					break;
			}

		} while (choice != 0);

	}
}


class Account{

	String accNumber;
	String accSinNum;
	int randNum;
	double accBalance = 0.0;
	String accName;
	String accAddress;

	// Object declaration for rand object
	Random rand = new Random();

	Account(String name, String address, String sinNumber){
		accName = name;
		accAddress = address;
		accSinNum = sinNumber;

		// Random number assigned to randNum
		randNum = rand.nextInt(9999) + 1000;

		// Converting randNum to String for concatenation
		String randNumS = Integer.toString(randNum);

		// Creating customer's account number
		accNumber = randNumS + accSinNum;

		System.out.println("\nYour account has been created.");
		System.out.println("Account number is " + accNumber);
		System.out.println("Name is " + accName);
		System.out.println("Address is " + accAddress);

	}

	public void setName(String name){
		accName = name;
		System.out.println("Name is: " + accName);
	}

	public void setAddress(String address){
		accAddress = address;
		System.out.println("Address is: " + accAddress);
	}

	public void checkFunds (){
		System.out.println("Your account balance is " + accBalance);
	}

	public void addFunds (double deposit){
		accBalance += deposit;
		System.out.println("Balance is: " + accBalance);
	}

	public void withdrawFunds (double withdraw){
		if( withdraw > accBalance )
			System.out.println("Insufficient funds");
		else
			accBalance = accBalance - withdraw;
		System.out.println("Balance is: " + accBalance);
	}
}