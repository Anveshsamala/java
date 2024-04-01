package com.Exceptionhandling;

import java.io.File;
import java.io.IOException;

public class Program3 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
String path="F:TESTING ENGINEER/JAVA/Raju.exe";
File f2=new File(path);
try {
	boolean b2=f2.createNewFile();
} catch (IOException e) {
	
	e.printStackTrace();
}
System.out.println("main method ended");
}
}
