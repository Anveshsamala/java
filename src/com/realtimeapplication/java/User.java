package com.realtimeapplication.java;

public class User
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	BankAccount ref=AccountManager.creatAccount(123,"ANVESH",20000.0,'l');
	ref.checkbal();
	ref.withdraw(5000);
	ref.checkbal();
	ref.deposit(10000);
	ref.checkbal();
	System.out.println("main method ended");
	
	}
	
}