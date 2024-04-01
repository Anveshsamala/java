package com.jspiders.dailywise;

public class Actor implements Comparable
{
String name;
int noOfMovies;
double salary;
public Actor(String name, int noOfMovies, double salary)
{
	this.name=name;
	this.noOfMovies=noOfMovies;
	this.salary=salary;
}
@Override
public String toString()
{
	return "Actor [name="+name+"  "+"noOfMovies="+noOfMovies+"  "+"salary="+salary+"]"; 
}
@Override
public int compareTo(Object ob)
{
	Actor at=(Actor)ob;
	//return this.noOfMovies-at.noOfMovies;
	//return (int) (this.salary-at.salary);
	String first=this.name;
	String second=at.name;
	return first.compareTo(second);
}
}
