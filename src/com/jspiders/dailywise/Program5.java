package com.jspiders.dailywise;


import java.util.TreeSet;

import com.qspiders.arrays.Mobile;

public class Program5
{
public static void main(String[] args)
{
	System.out.println("main method started ");
	TreeSet ts=new TreeSet();
	Mobile m1=new Mobile(123, "MI", 76);
	Mobile m2=new Mobile(123, "MI", 76);
	ts.add(m1);
	ts.add(m2);
	
	
	System.out.println(ts.size());
	for(Object ob:ts)
	{
		System.out.println(ob);
	}
	System.out.println("main method ended");
}
}
