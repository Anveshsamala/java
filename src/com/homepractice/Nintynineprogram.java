package com.homepractice;
class Paymentapp1
{
	public void pay1()
	{
		System.out.println("using Payment application");
	}
}
class GooglePay1 extends Paymentapp1
{
	public void pay1()
	{
		System.out.println("using Google pay application");
	}
}
class Phonepe1 extends Paymentapp1
{
	public void pay1()
	{
		System.out.println("using Phonepe Application");
	}
}
class Paytm1 extends Paymentapp1
{
	public void pay1()
	{
		System.out.println("using Paytm application");
	}
}
class User1
{
	public static void transfermoney(Paymentapp1 ref)
	{
		ref.pay1();
	}
}
public class Nintynineprogram 
{
	public static void main(String[] args) 
	{
		User1 ref1=new User1();
		ref1.transfermoney(new Paymentapp1());
		ref1.transfermoney(new GooglePay1());
		ref1.transfermoney(new Phonepe1());
		ref1.transfermoney(new Paymentapp1());
	}
}
