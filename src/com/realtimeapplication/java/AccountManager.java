package com.realtimeapplication.java;

public class AccountManager
{
	public static BankAccount creatAccount(int num,String name,double bal,char type)
	{
		if(type=='s')
		{
			return new SavingsAccount(num,name,bal);
		}
		else
		{
			return new LoanAccount(num,name,bal);	
		}
	}
}