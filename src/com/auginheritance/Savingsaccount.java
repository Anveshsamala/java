package com.auginheritance;

public class Savingsaccount implements Bankaccount
{
int accno;
String accholdname;
double balance;
Savingsaccount(int accno, String accholdname, double balance)
{
	this.accno=accno;
	this.accholdname=accholdname;
	this.balance=balance;
}
public void deposit(double amt)
{
	balance=balance+amt;
	System.out.println("in savings account deposit amount= "+amt);
}
public void withdraw(double amt)
{
	if(balance>=amt)
	{
		balance=balance-amt;
		System.out.println("in savings account withdraw amount is= "+amt);
	}
}
public void checkbal()
{
	System.out.println("check balance= "+balance);
}
}
