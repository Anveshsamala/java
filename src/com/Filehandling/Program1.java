package com.Filehandling;
import java.io.File;
import java.io.IOException;
public class Program1 
{
public static void main(String[] args) 
{
System.out.println("main method started");

String path="F:TESTING ENGINEER/JAVA/RAJUANVESH.txt";
File f2=new File(path);
try {
	f2.createNewFile();
} catch (IOException e) {
	
	e.printStackTrace();
}
System.out.println("main method ended");
}
}
