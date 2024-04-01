package com.oops1;
class Paymentsapp
{
	public void pay()
	{
		System.out.println("payment application using pay");
	}
}
class Phonepe extends Paymentsapp
{
	public void pay()
	{
		System.out.println("Phonepe application using pay");
	}
}
class Googlepay extends Paymentsapp
{
	public void pay()
	{
		System.out.println("Googlepay application using pay");
	}
}
class Paytm extends Paymentsapp
{
	public void pay()
	{
		System.out.println("Paytm application using pay");
	}
}
class User
{
	public void moneyTransfer(Paymentsapp ref)
	{
	ref.pay();	
	}
}
public class Runtime1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
User u1=new User();
u1.moneyTransfer(new Paymentsapp());
u1.moneyTransfer(new Phonepe());
u1.moneyTransfer(new Googlepay());
u1.moneyTransfer(new Paytm());

System.out.println("main method ended");
}
}
