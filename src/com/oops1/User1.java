package com.oops1;
interface BankAccount
{
	public abstract void deposit(double amt);
	public abstract void withdrawal(double amt);
	public abstract void checkbal();
}
class  SavingsAccount implements BankAccount
{
	String name;
	int accno;
	double balance;
	SavingsAccount(String name,int accno,double balance)
	{
	this.name=name;
	this.accno=accno;
	this.balance=balance;
	}
	public void deposit(double amt)
	{
		balance =balance+amt;
		System.out.println("deposit amount in savings account="+amt);
	}
	
	public void withdrawal(double amt)
	{
	if(balance>=amt)
	{
	{
		balance=balance-amt;
		System.out.println("withdrawal amount in savings account="+amt);
	}
	}
	else
	{
		System.out.println("insufficient funds");
	}
	}
	public void checkbal()
	{
		System.out.println("ballance="+balance);
	}
	
}
class LoanAccount implements BankAccount
{
	String name;
	int accno;
	double balance;
	LoanAccount(String name,int accno,double balance)
	{
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}
	public void deposit(double amt)
	{
		if(balance>=amt)
		{
		balance=balance-amt;
		System.out.println("deposit amount in Loan Account="+amt);
	}
	
	else 
	{
		System.out.println("insufficent funds in Loan account="+amt);
	}
	}
	public void withdrawal(double amt)
	{
		balance=balance+amt;
		System.out.println("withdrawal amount in LoanAccount="+amt);
	}
	public void checkbal()
	{
		System.out.println("balance="+balance);
	}
}
class AccountManager
{
	public static BankAccount CreatAccount(String name,int accno,double balance,char type)
	{
		if(type=='s')
		{
		return new SavingsAccount(name, accno, balance);
		}
		else
		{
		return new LoanAccount(name, accno,balance);
		}
	}
}
public class User1
{
public static void main(String[] args) 
{
	BankAccount ref=AccountManager.CreatAccount("anvesh", 124758, 12000, 'w');
	ref.checkbal();
	ref.deposit(10000);
	ref.checkbal();
	ref.withdrawal(5000);
	ref.checkbal();
}
}
