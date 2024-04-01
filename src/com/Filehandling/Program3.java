package com.Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Program3 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="I Love My Family members";

FileWriter fw = null;
try 
{
	fw = new FileWriter("F:TESTING ENGINEER/JAVA/RAJUANVESH.txt");
} 
catch (IOException e) 
{
	
	e.printStackTrace();
}
try 
{
	fw.write(s1);
} 
catch (IOException e) 
{
	
	e.printStackTrace();
}
finally
{
	try {
		fw.flush();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	try {
		fw.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
System.out.println("main method ended");
}
}
