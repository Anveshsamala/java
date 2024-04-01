package com.qspiders.collections;

public class Mobile11 
{
	int quality;
	String brand;
	double rate;
	public Mobile11(int quality, String brand, double rate)
	{ 
		this.quality=quality;
		this.brand=brand;
		this.rate=rate;
	}
	public String toString()
	{
		return "Quality="+quality+"  "+"Brand="+brand+"  "+"Rate="+rate;
	}
}
