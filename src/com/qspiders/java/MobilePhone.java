package com.qspiders.java;

public class MobilePhone 
{
int imei;
String brand;
float memory;
public MobilePhone(int imei, String brand, float memory)
{
	this.imei=imei;
	this.brand=brand;
	this.memory=memory;
}
public boolean equals(Object ob)
{
	MobilePhone mt2=(MobilePhone)ob;
	return this.imei==mt2.imei;
}
public String toString()
{
	return imei+"    "+brand+"     "+memory;	
}

}
