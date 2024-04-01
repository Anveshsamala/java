package com.Filehandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Program4 
{
public static void main(String[] args) 
{
System.out.println("main method started");
FileReader fd = null;
try 
{
	fd = new FileReader("F:TESTING ENGINEER/JAVA/RAJUANVESH.txt");
} catch (FileNotFoundException e) 
{
	
	e.printStackTrace();
}
try 
{
	int a=fd.read();
	while(a!=-1)
	{
		System.out.print((char)a);
	a=fd.read();
	}
} catch (IOException e) 
{
	
	e.printStackTrace();
}
finally
{
	try 
	{
		fd.close();
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
}
System.out.println("main method ended");
}
}
