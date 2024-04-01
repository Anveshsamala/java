package com.auginheritance;

public class Loanaccount implements Bankaccount
{
int accno;
String accholdname;
double balance;
Loanaccount(int accno, String accholdname, double balance)
{
	this.accno=accno;
	this.accholdname=accholdname;
	this.balance=balance;
}
public void deposit(double amt)
{
	if(balance>=amt)
	{
		balance=balance-amt;
		System.out.println("in loan account deposit amount= "+amt);
	}
}
public void withdraw(double amt)
{
	balance=balance+amt;
	System.out.println("in loan account withdraw amount= "+amt);
}
public void checkbal()
{
	System.out.println("balance= "+balance);
}

}
