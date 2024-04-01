package com.auginheritance;

public class Savingsaccount1 implements Bankaccount1
{
int accnum;
String name;
double bal;
Savingsaccount1(int accnum, String name, double bal)
{
	this.accnum=accnum;
	this.name=name;
	this.bal=bal;
}
public void deposit1(double amt)
{
	bal=bal+amt;
	System.out.println("Savings account deposit amt= "+amt);
}
public void withdraw1(double amt)
{
	if(bal>=amt)
	{
		bal=bal-amt;
		System.out.println("Savings account withdraw amt= "+amt);
	}
}
public void checkbal1()
{
	System.out.println("savings bal= "+bal);
}

}
