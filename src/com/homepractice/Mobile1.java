package com.homepractice;

public class Mobile1 
{
int imei;
String brand;
double cost;
Mobile1(int imei,String brand, double cost)
{
	this.imei=imei;
	this.brand=brand;
	this.cost=cost;
}
@Override
public String toString()
{
	return "Imei= "+imei+" "+"Brand= "+brand+" "+"Cost= "+cost;
}
}
