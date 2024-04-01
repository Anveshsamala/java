package com.Collectionsmodule3;

public class Program2 
{
int noofflight;
String flightname;
double costofflight;
Program2(int noofflight, String flightname, double costofflight)
{
	this.noofflight=noofflight;
	this.flightname=flightname;
	this.costofflight=costofflight;
}
public String toString()
{
	return "No of Flights= "+noofflight+" "+"Flight Name= "+flightname+"  "+"Cost of Flight= "+costofflight;
}
}
