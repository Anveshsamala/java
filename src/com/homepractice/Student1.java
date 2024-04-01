package com.homepractice;

public class Student1 
{
	int regdno;
	String name;
	double rating;
	Student1(int regdno,String name, double rating)
	{
		this.regdno=regdno;
		this.name=name;
		this.rating=rating;
	}
	@Override
	public String toString()
	{
		return "regdno= "+regdno+" "+"name= "+name+"rating= "+rating;
	}
}
