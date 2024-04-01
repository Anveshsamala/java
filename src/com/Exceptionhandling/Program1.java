package com.Exceptionhandling;

import java.io.File;
import java.io.IOException;

public class Program1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
//step:1
String path="f:/TESTING ENGINEER/JAVA/anvesh.txt";
//step:2
File fl=new File(path);
try
{
	boolean res=fl.createNewFile();
	System.out.println(res);
}
catch(IOException ref)
{
	System.out.println("IO Exception");
}
System.out.println("main method ended");
}
}
