package com.qspiders.collections;

public class Laptop 
{
	
	String brand;
	int ram;
	public Laptop(String brand, int ram)
	{
		
		this.brand=brand;
		this.ram=ram;
	}
	public String toString()
	{
		return "Mobile [Brand="+brand+"  "+"Ram="+ram+"]";
	}
}
