package com.jspiders.dailywise;

import java.io.IOException;
import java.sql.SQLException;

class Sample1
{
	public void test() throws IOException,SQLException,InterruptedException
	{
	//throw new SQLException();
	//throw new IOException();
	//throw new InterruptedException();
	}
}
public class Program17 
{
public static void main(String[] args) 
{
System.out.println("main method started");
try {
	new Sample1().test();
} 
catch (IOException e) 
{
	
	e.printStackTrace();
} 
catch (SQLException e) 
{
	
	e.printStackTrace();
}
catch (InterruptedException e)
{
	
	e.printStackTrace();
}
System.out.println("main method ended");
}
}
