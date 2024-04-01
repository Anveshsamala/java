package com.realtimeapplication.java;

public class SavingsAccount implements BankAccount
{
public int accno;
public String accname;
public double balance;
SavingsAccount(int accno,String accname,double balance)
{
	this.accno=accno;
	this.accname=accname;
	this.balance=balance;
}
public void deposit(double amt)
{
	balance=balance+amt;
	System.out.println("amount depposit="+amt);
}
public void withdraw(double amt)
{
	if(balance>=amt)
	{
		balance=balance-amt;
		System.out.println("amount withdraw="+amt);
	}
	else
	{
		System.out.println("go learn maths and come");
	}
}
public void checkbal()
{
	System.out.println("balance="+balance);
}
}
