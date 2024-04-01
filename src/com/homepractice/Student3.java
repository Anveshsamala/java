package com.homepractice;

public class Student3 
{
int num;
String name;
double percentage;
Student3(int num,  String name,double percentage)
{
	this.num=num;
	this.name=name;
	this.percentage=percentage;
}
@Override
public String toString()
{
	return "Num= "+num+" "+"Name= "+name+" Percentage="+percentage;
}
}
