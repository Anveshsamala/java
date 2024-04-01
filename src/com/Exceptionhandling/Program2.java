package com.Exceptionhandling;

import java.io.File;
import java.io.IOException;

public class Program2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String path="f:/TESTING ENGINEER/JAVA/Rahul.pdf";
File f1=new File(path);
try {
	boolean b1=f1.createNewFile();
} catch (IOException e) {
	
	e.printStackTrace();
}
System.out.println("main method ended");
}
}
