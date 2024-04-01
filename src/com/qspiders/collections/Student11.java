package com.qspiders.collections;

public class Student11 
{
int rollno;
String name;
double percentage;
public Student11(int rollno,  String name,double percentage)
{
	this.rollno=rollno;
	this.name=name;
	this.percentage=percentage;
}
public String toString()
{
	return "Roll No="+rollno+"  "+"Name="+name+"  "+"Percentage="+percentage;
}
}
