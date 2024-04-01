package com.qspiders.arrays;

public class Mobile implements Comparable
{
int imei;
String brand;
int memory;
public Mobile(int imei, String brand, int memory)
{
	this.imei=imei;
	this.brand=brand;
	this.memory=memory;
}
@Override
public String toString()
{
	return "Mobile [imei="+imei+"  " +"brand="+brand+"  " +"memory="+memory+ "]";
}
@Override
public int hashCode()
{
	return imei;
}
@Override
public boolean equals(Object ob)
{
	Mobile mt=(Mobile)ob;
	return this.imei==mt.imei;
}
@Override
public int compareTo(Object ob) 
{
	Mobile mt=(Mobile)ob;
	return this.imei-mt.imei;
}

}
