package com.qspiders.collections;

public class Flipkart 
{
int orderno;
String Proname;
double cost;
Flipkart(int orderno, String proname, double cost)
{
	this.orderno=orderno;
	this.Proname=Proname;
	this.cost=cost;
}
public String toString()
{
	return "Order no="+orderno+"  "+"Proname="+Proname+"  "+"Cost="+cost;
}
}
