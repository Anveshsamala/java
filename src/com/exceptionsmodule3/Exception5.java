package com.exceptionsmodule3;

import java.io.IOException;

class Oneday
{
	public void studytesting()throws IOException
	{
		System.out.println("testing...");
		throw new IOException();
	}
}
class Secondday
{
	public void studyjava()throws IOException
	{
		System.out.println("java...");
		Oneday f1=new Oneday();
		f1.studytesting();
	}
}
class Thirdday
{
	public void studyapti()throws IOException
	{
		System.out.println("apti...");
		Secondday s2=new Secondday();
				s2.studyjava();
	}
}
class Fourthday
{
	public void studyselenium()throws IOException
	{
		System.out.println("selenium...");
		Thirdday t3=new Thirdday();
		t3.studyapti();
	}
}
public class Exception5 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Fourthday f4=new Fourthday();
try
{
f4.studyselenium();
}
catch(IOException ref)
{
	System.out.println("Input Output Exception");
}
System.out.println("mainmethod ended");
}
}
