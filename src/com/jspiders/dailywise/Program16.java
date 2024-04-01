package com.jspiders.dailywise;
import java.io.IOException;
class Student1
{
	public void studytelugu() throws IOException
	{
		System.out.println("telugu...");
		throw new IOException();
	}
	
}
class Student2
{
	public void studyhindi() throws IOException
	{
		System.out.println("hindi...");
		Student1 s1=new Student1();
		s1.studytelugu();
	}
	
}
class Student3
{
	public void studyenglish() throws IOException
	{
		System.out.println("english...");
		Student2 s2=new Student2();
		s2.studyhindi();
	}
	
}
public class Program16 
{
public static void main(String[] args) throws IOException 
{
System.out.println("main method started");
Student3 s3=new Student3();
try
{
s3.studyenglish();
}
catch(IOException ref)
{
	System.out.println("Exception handled in main");
}

System.out.println("main method ended");
}
}
