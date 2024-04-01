package com.homepractice;

public class Car1 
{
int tyres;
String brand;
double cost;
Car1(int tyres, String brand, double cost)
{
	this.tyres=tyres;
	this.brand=brand;
	this.cost=cost;
}
public String toString()
{
	return "Tyres= "+tyres+" "+"Brand= "+brand+" "+"Cost= "+cost;
}
}
