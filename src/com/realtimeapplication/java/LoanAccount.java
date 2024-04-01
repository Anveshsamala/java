package com.realtimeapplication.java;

public class LoanAccount implements BankAccount
{
public int accno;
public String accname;
public double balance;
LoanAccount(int accno,String accname,double balance)
{
	this.accno=accno;
	this.accname=accname;
	this.balance=balance;
}
public void deposit(double amt)
{
	if(balance>=amt)
	{
	balance=balance-amt;
	System.out.println("amount depposit="+amt);
	}
	else
	{
		System.out.println("go learn maths and come");
	}
	
}
public void withdraw(double amt)
{
	
		balance=balance+amt;
		System.out.println("amount withdraw="+amt);
	}
	
public void checkbal()
{
	System.out.println("balance="+balance);
}
}