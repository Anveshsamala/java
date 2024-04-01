package com.Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Program2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="I am Proud to be Son of SRINIVAS";
FileWriter f1=null;
try
{
f1=new FileWriter("F:TESTING ENGINEER/JAVA/RAJUANVESH.txt");
	f1.write(s1);
	System.out.println("data transfered");
}
catch(IOException ref)
{
	ref.printStackTrace();
}	
finally
{
	
	try {
		f1.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		f1.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

System.out.println("main method ended");
}
}
