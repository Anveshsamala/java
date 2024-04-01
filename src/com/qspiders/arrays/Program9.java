package com.qspiders.arrays;

import java.util.ArrayList;

public class Program9 
{
public static void main(String[] args)
{
System.out.println("main method started");
ArrayList al=new ArrayList();

al.add(new Student1(345,"testing",1));
al.add(new Mobile(345,"VIVO",5));
al.add(new Laptop("LENOVO",34));
for(int i=0;i<al.size();i++)
{
	Object ob=al.get(i);
	if(ob instanceof Student1)
	{
	Student1 st1=(Student1)ob;
	System.out.println("id="+st1.id);
	System.out.println("name="+st1.name);
	System.out.println("rating="+st1.ratings);
	}
	else if(ob instanceof Mobile)
	{
		Mobile mt=(Mobile)ob;          ////DOWM CASTING 
		
		System.out.println(mt.brand);
		System.out.println(mt.imei);
		System.out.println(mt.memory);
	}
	else if(ob instanceof Laptop)
	{
		Laptop lt=(Laptop)ob;
		System.out.println(lt.brand);
		System.out.println(lt.ram);
				
	}
		
}
System.out.println("main method ended");
}
}
