package com.qspiders.collections;

import java.util.ArrayList;

public class Program3 
{
public static void main(String[] args)
{
	System.out.println("main method started");

	ArrayList al=new ArrayList();

	al.add(new Student(1234, "ANVESH", 5));
	al.add(new Mobile(143,"MI",21000));
	al.add(new Laptop("HP",8));
	
	for(int i=0;i<al.size();i++)
	{
		Object ob=al.get(i);
		if(ob instanceof Student)
		{
			Student st=(Student)ob;
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println(st.rating);
		}
		else if(ob instanceof Mobile)
		{
		Mobile mb=(Mobile)ob;
		System.out.println(mb.imei);
		System.out.println(mb.brand);
		System.out.println(mb.memory);
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
