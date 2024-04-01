package com.module3;
class Mobile
{
	int imei;
	String brand;
	double  cost;
	Mobile(int imei, String brand, double cost)
	{
		this.imei=imei;
		this.brand=brand;
		this.cost=cost;
	}
	public boolean equals(Object ob)
	{
		Mobile m1=(Mobile)ob;
		return this.imei==imei;
	}
	public String toString()
	{
		return "imei=" +imei+"  "+"brand=" +brand+"  "+"cost=" +cost;
	}
}
public class Equalsmethod1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Mobile mt1=new Mobile(12345, "THOSHIBA", 55000);
Mobile mt2=new Mobile(12345,"THOSHIBA",55000);
System.out.println(mt1==mt2);///address comparison
System.out.println(mt1.equals(mt2));//Equals method hashcode and content comparison
System.out.println(mt1);
System.out.println(mt2);
System.out.println("main method ended");
}
}
