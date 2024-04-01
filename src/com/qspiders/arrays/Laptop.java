package com.qspiders.arrays;

public class Laptop 
{
String brand;
int ram;
public Laptop(String brand,int ram)
{
	this.brand=brand;
	this.ram=ram;
}
@Override
public String toString()
{
	return "Laptop [brand=" +brand+"  " + ",ram=" +ram +"]";
}
}
