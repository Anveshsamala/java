package com.qspiders.collections;

public class Student 
{
int id;
String name;
double rating;
public Student(int id, String name, double rating)
{
	this.id=id;
	this.name=name;
	this.rating=rating;
}
public String toString()
{
	return "Student [Id="+id+"  "+"Name="+name+"  "+"Rating="+rating+"]";
}
}
