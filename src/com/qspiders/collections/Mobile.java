package com.qspiders.collections;

public class Mobile
{
int imei;
String brand;
int memory;
public Mobile(int imei,String brand, int memory)
{
	this.imei=imei;
	this.brand=brand;
	this.memory=memory;
}
public String toString()
{
	return "Mobile [Imei="+imei+"  "+"Brand="+brand+"  "+"Memory="+memory+"]";
}
}
