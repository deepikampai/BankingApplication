package com.bank.application;
import java.util.Scanner;

public class BankAccount {
	private int balance;
	private int previousTransaction;
	String customerID;
	String customerName;
	
	BankAccount(String cID,String cName){
		this.customerID = cID;
		this.customerName = cName;
	}
	
	void deposit(int amount){
		if(amount != 0) {
		balance = balance + amount;
		previousTransaction = amount;
		}		
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Amount Deposited :" +previousTransaction);			
		}else if(previousTransaction < 0) {
			System.out.println("Amount Withdrawn :" +Math.abs(previousTransaction));
		}else {
			System.out.println("No transaction " );
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome" +customerName);
		System.out.println("Your Id is:" +customerID);
		System.out.println("\n");
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdrawn");
		System.out.println("D.Previous Transaction");
		System.out.println("E. Exit");
		do 
		{
			System.out.println("-----------------");
			System.out.println("Enter an Option:");
			System.out.println("-----------");
			option = scanner.next().charAt(0);
			
			switch(option) {
			case 'A':
				System.out.println("-----------------");
				System.out.println("Deposit:" +balance);
				System.out.println("-----------");
				break;
			
			case 'B':
				System.out.println("-----------------");
				System.out.println("enter amount to be deposited");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("-----------");
				break;
			
			case 'C':
				System.out.println("-----------------");
				System.out.println("enter amount to be Withdrawn");
				System.out.println("-----------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				break;
			
			case'D':
				System.out.println("-----------------");
				getPreviousTransaction();				
				System.out.println("-----------");
				break;
			case 'E':
				System.out.println("***********");
				break;
			default:
				System.out.println("Invalid option! Please enter again");
				break;
				
			 }
			}while(option != 'E'); 
				
		System.out.println("Thank you for your services");
				
	}

}
