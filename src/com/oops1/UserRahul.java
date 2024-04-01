package com.oops1;
interface BankAccount143
{
	public abstract void deposit143(double amt);
	public abstract void withdrawal143(double amt);
	public abstract void checkbal143();
}
class SavingsAccount143 implements BankAccount143 
{
	String name143;
	int accno143;
	double balance143;
	SavingsAccount143(String name143, int accno143,double balance143)
	{
		this.name143=name143;
		this.accno143=accno143;
		this.balance143=balance143;
	}
	public void deposit143(double amt)
	{
		balance143=balance143+amt;
		System.out.println("deposit143="+amt);
	}
	public void withdrawal143(double amt)
	{
		if(balance143>=amt)
		{
			balance143=balance143-amt;
			System.out.println("withdrawal143="+amt);
		}
		else
		{
			System.out.println("in suffient funds");
		}
	}
	public void checkbal143()
	{
		System.out.println("balance143="+balance143);
	}
	
}
class LoanAccount143 implements BankAccount143 
{
	String name143;
	int accno143;
	double balance143;
	LoanAccount143(String name143, int accno143, double balance143)
	{
	this.name143=name143;
	this.accno143=accno143;
	this.balance143=balance143;
	
	}
	public void deposit143(double amt)
	
	{
		if(balance143>=amt)
		{
			balance143=balance143+amt;
			System.out.println("deposit ="+amt);
		}
	}
	public void withdrawal143(double amt)
	{
		balance143=balance143-amt;
		System.out.println("withdrawal="+amt);
	}
	public void checkbal143()
	{
		System.out.println("balance143="+balance143);
	}
	
	}
	class Representative143
	{
		public static BankAccount143 CreatAccount143(String name143,int accno143, double balance143,char type)
		{
			if(type=='S')
			{
				return new SavingsAccount143(name143,accno143,balance143);
			}
			else
			{
				return new LoanAccount143(name143,accno143,balance143);
			}
		}
	}

public class UserRahul 
{
public static void main(String[] args) 
{
	BankAccount143 ref143=Representative143.CreatAccount143("rahul143",123413,25000,'s');	
	ref143.checkbal143();
	ref143.deposit143(10000);
	ref143.checkbal143();
	ref143.withdrawal143(23000);
	ref143.checkbal143();
}
}
