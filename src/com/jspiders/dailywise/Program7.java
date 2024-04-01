package com.jspiders.dailywise;

import java.util.PriorityQueue;

public class Program7 
{

	public static void main(String[] args)
	{
	System.out.println("main method started");
	
	Actor at1=new Actor("balayya", 103,5555.5);
	Actor at2=new Actor("prabhas", 26,100.5);
	Actor at3=new Actor("sampoo", 4,0.5);
	Actor at4=new Actor("pawan", 25,3000.5);
	Actor at5=new Actor("mahesh babu", 47,4355.5);
	Actor at6=new Actor("arjun", 19,234.5);
	Actor at7=new Actor("ram", 13,23.5);
	Actor at8=new Actor("mahesh babu", 47,4355.5);
	
	PriorityQueue pq=new PriorityQueue();
	pq.add(at1);
	pq.add(at2);
	pq.add(at3);
	pq.add(at4);
	pq.add(at5);
	pq.add(at6);
	pq.add(at7);
	pq.add(at8);
	int a=pq.size();
	System.out.println(pq.size());
	System.out.println("output od default sorting");
	for (int i = 0; i < a; i++) 
	{
	Object ob=pq.poll();
	System.out.println(ob);
	
	}
	
	PriorityQueue pq2=new PriorityQueue(new SortonNoofMovies());
	pq2.add(at1);
	pq2.add(at2);
	pq2.add(at3);
	pq2.add(at4);
	pq2.add(at5);
	pq2.add(at6);
	pq2.add(at7);
	pq2.add(at8);
	int b=pq2.size();
	System.out.println("output od customised");
	for (int i = 0; i < b; i++) 
	{
	Object ob=pq2.poll();
	System.out.println(ob);
	
	}
	
	PriorityQueue pq3=new PriorityQueue(new SortbasedonSalary());
	pq3.add(at1);
	pq3.add(at2);
	pq3.add(at3);
	pq3.add(at4);
	pq3.add(at5);
	pq3.add(at6);
	pq3.add(at7);
	pq3.add(at8);
	int c=pq3.size();
	System.out.println("output od customised");
	for (int i = 0; i < c; i++) 
	{
	Object ob=pq3.poll();
	System.out.println(ob);
	
	}
	System.out.println("main method ended");
	}
}
