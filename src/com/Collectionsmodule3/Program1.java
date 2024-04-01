package com.Collectionsmodule3;

public class Program1 
{
int pages;
String name;
double cost;
Program1(int pages, String name, double cost)
{
	this.pages=pages;
	this.name=name;
	this.cost=cost;
}
public String toString()
{
	return "pages= "+pages+"  "+"name= "+name+"  "+"Cost= "+cost;
}
}
