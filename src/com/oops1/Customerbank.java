package com.oops1;
interface Bankaccount22
{
	public abstract void deposit22(double amt);
	public abstract void withdrawal22(double amt);
	public abstract void checkbal22();
}
class SavingsAccount22 implements Bankaccount22 
{
	String name22;
	int accno22;
	double balance22;
	SavingsAccount22(String name22, int accno22,double balance22)
	{
		this.name22=name22;
		this.accno22=accno22;
		this.balance22=balance22;
	}
	public void deposit22(double amt)
	{
		balance22=balance22+amt;
		System.out.println("balance22 deposit="+amt);
	}

public void withdrawal22(double amt)
{
	if(balance22>=amt)
	{
		balance22=balance22-amt;
		System.out.println("balance22 withdrawal="+amt);
	}
}
public void checkbal22()
{
	System.out.println("checkbalance Savings="+balance22);
}

}
class LoanAccount22 implements Bankaccount22 
{
	String name22;
	int accno22;
	double balance22;
	LoanAccount22(String name22,int accno22,double balance22)
	{
		this.name22=name22;
		this.balance22=balance22;
		this.accno22=accno22;
	}
	public void deposit22(double amt)
	{
		if(balance22>=amt)
		{
		balance22=balance22-amt;
		System.out.println("deposit balance22="+amt);
		}
	}
	public void withdrawal22(double amt)
	{
		balance22=balance22+amt;
		System.out.println("withdrawal balance22="+amt);
	}
	public void checkbal22()
	{
		System.out.println("checkbal in LoanAccount22="+balance22);
	}
}
class BankManager22
{
	public static Bankaccount22 CreatAccount22(String name22, int accno22, double balance22, char type )
	{
		if(type=='S')
		{
			return new SavingsAccount22(name22,accno22,balance22);
		}
		else
		{
			return new LoanAccount22(name22,accno22,balance22);
		}
	}
}
public class Customerbank 
{
public static void main(String[] args) 
{
	Bankaccount22 ref22=BankManager22.CreatAccount22("ANVESH", 123478, 20000.0, 'S');
	ref22.checkbal22();
	ref22.deposit22(5000);
	ref22.checkbal22();
	ref22.withdrawal22(10000);
	ref22.checkbal22();
}
}
