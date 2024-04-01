package com.qspiders.java;

public class User2 
{
public static void main(String[] args)
{
	Flipkart f1=new Flipkart(10, "ANVESH", 5);
	System.out.println("Orders="+f1.getSelling());
	System.out.println("Customer="+f1.getCustomer());
	System.out.println("Cancelled="+f1.getReturning());
	f1.setCustomer("Rahul");
	f1.setSelling(100);
	f1.setReturning(20);
	System.out.println("Orders="+f1.getSelling());
	System.out.println("Customer="+f1.getCustomer());
	System.out.println("Cancelled="+f1.getReturning());
}
}
