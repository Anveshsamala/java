package com.homepractice;

public class Seventyfourprogram 
{
	int a;
	String name;
	double cost;
	Seventyfourprogram(int a,String name,double cost)
	{
		this.a=a;
		this.name=name;
		this.cost=cost;
	}
	public String toString()
	{
		return "a= "+a+"  "+"Name= "+name+"  "+"Cost= "+cost;
	}
public static void main(String[] args) 
{
System.out.println("main method started");

Seventyfourprogram ref=new Seventyfourprogram(124, "Raju", 120000);
System.out.println(ref.toString());

System.out.println("main method ended");
}
}
