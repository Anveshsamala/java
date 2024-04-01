package com.homepractice;
interface Bankacc00
{
	public abstract void deposit00(double amt);
	public abstract void withdrawal00(double amt);
	public abstract void checkbala00();
}
 class Savings00 implements Bankacc00
{
	int number;
	String nameofcustomer;
	double bala;
	Savings00(int number,String nameofcustomer, double bala)
	{
		this.number=number;
		this.nameofcustomer=nameofcustomer;
		this.bala=bala;
	}
	public void deposit00(double amt)
	{
		bala=bala+amt;
	}
	public void withdrawal00(double amt)
	{
		if(bala>=amt)
		{
			bala=bala-amt;
		}
		else
		{
			System.out.println(bala);
		}
	}
	public void checkbala00()
	{
		System.out.println(bala);
	}
	
}
 class Loanacc00 implements Bankacc00
{
int number;
String nameofcustomer;
double bala;
Loanacc00(int num, String nameofcustomer, double bala)
		{
			this.number=number;
			this.nameofcustomer=nameofcustomer;
			this.bala=bala;
		}
public void deposit00(double amt)
{
	if(bala>=amt)
	{
		bala=bala-amt;
	}
	else
	{
		System.out.println(bala);
	}
	
}
public void withdrawal00(double amt)
{
	bala=bala+amt;
}
public void checkbala00()
{
	System.out.println(bala);
}
}
class Manager
{
	public static Bankacc00 createacc00(int accno, String accname, double accbal, char type)
	{
		if(type=='s')
		{
			return new Savings00(accno, accname, accbal);
		}
		else
		{
			return new Loanacc00(accno, accname, accbal);
		}
	}
}
public class Abstraction00 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Bankacc00 bb=Manager.createacc00(1237, "SAMALA", 25000, 's');
bb.deposit00(10000);
bb.checkbala00();
bb.withdrawal00(30000);
bb.checkbala00();
System.out.println("main method ended");
}
}

