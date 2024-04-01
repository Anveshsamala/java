package com.qspiders.java;

public class User3
{
	public static void main(String[] args) 
	{
	MobilePhone mp1=new MobilePhone(2345, "SAMSUNG", 256f);
	MobilePhone mp2=new MobilePhone(2345, "SAMSUNG", 256f);
	System.out.println(mp1==mp2);//address of the object
	System.out.println(mp1.equals(mp2));//content of the object
	System.out.println(mp1);
	System.out.println(mp2);
	}
}
