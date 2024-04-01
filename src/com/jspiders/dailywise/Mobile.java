package com.jspiders.dailywise;

public class Mobile 
{
int imei;
String brand;
double cost;
Mobile(int imei, String brand, double cost)
{
	this.imei=imei;
	this.brand=brand;
	this.cost=cost;
}
public int hashCode()
{
	return imei;
}
public boolean equals(Object ob)
{
	Mobile mb=(Mobile)ob;
	return this.imei==mb.imei;
}
public String toString()
{
	return "Imei="+imei+"  "+"Brand="+brand+"  "+"Cost="+cost;
}
}
