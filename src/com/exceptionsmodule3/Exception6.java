package com.exceptionsmodule3;

import java.io.IOException;
import java.sql.SQLException;

class Sample1
{
	public void test()throws IOException,SQLException,InterruptedException
	{
		
		System.out.println("test method....");
	}
}
public class Exception6 
{
public static void main(String[] args) 
{
System.out.println("mainmethod started");
Sample1 s1=new Sample1();
try
{
s1.test();
}
catch(IOException ref)
{
	System.out.println("IO exception");
}
catch(InterruptedException ref1)
{
	System.out.println("interupted exception");
}
catch(SQLException ref2)
{
	System.out.println("SQL exception");
}
System.out.println("main method ended");
}
}
