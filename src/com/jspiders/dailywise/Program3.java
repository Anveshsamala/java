package com.jspiders.dailywise;
import java.util.HashSet;
public class Program3 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	HashSet hs=new HashSet();
	
	hs.add("d");
	hs.add("b");
	hs.add("d");
	hs.add("c");
	hs.add("A");
	hs.add("a");
	
	/*Iterator ref=hs.iterator();
	while(ref.hasNext())
	{
		Object ob=ref.next();
		System.out.println(ob);
	}*/

	for(Object ob:hs)
	{
		System.out.println(ob);
	}
	
	System.out.println("main method ended");
	}
}
