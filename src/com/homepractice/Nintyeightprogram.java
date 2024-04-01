package com.homepractice;
class Paymentapp
{
	public void pay()
	{
		System.out.println("pay using payment app");
	}
}
class Googlepay extends Paymentapp
{
	public void pay()
	{
		System.out.println("pay using googler pay app");
	}
}
class Phonepe extends Paymentapp
{
	public void pay()
	{
		System.out.println("pay using Phonepe app");
	}
}
class Paytm extends Paymentapp
{
	public void pay()
	{
		System.out.println("pay using Paytm app");
	}
}
class User
{
	public void transfermoney(Paymentapp p1)
	{
	p1.pay();	
	}
}
public class Nintyeightprogram 
{

	public static void main(String[] args) 
	{
		
User ref=new User();
ref.transfermoney(new Paymentapp());
ref.transfermoney(new Googlepay());
ref.transfermoney(new Phonepe());
ref.transfermoney(new Paytm());
	}

}
