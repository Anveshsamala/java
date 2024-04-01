package com.auginheritance;

public class Bankmanager 
{
public static Bankaccount creataccount(int accno, String accholdname, double balance, char ch )
{
	if(ch=='s')
	{
		return new Savingsaccount(accno, accholdname, balance);
	}
	else
	{
		return new Loanaccount(accno, accholdname, balance);
	}
}
}
