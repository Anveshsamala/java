package com.Collectionsmodule3;

public class Byke1 
{
int number;
String bykename;
double costofbyke;
Byke1(int number, String bykename, double costofbyke)
{
	this.number=number;
	this.costofbyke=costofbyke;
	this.bykename=bykename;
}
public String toString()
{
	return "Number od bykes= "+number+"  "+"Byke Name= "+bykename+"  "+"Cost of Byke= "+costofbyke;
}
}
