package com.qspiders.arrays;

public class Student1 
{
int id;
String name;
double ratings;
public Student1(int id, String name, double rating)
{
	this.id=id;
	this.name=name;
	this.ratings=rating;
}
@Override
public String toString()
{
	return "Student [id="+id+ "   "+ "name="+name+"   "+ "rating="+ratings;
}
}
