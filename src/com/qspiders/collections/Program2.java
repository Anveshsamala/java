package com.qspiders.collections;
import java.util.ArrayList;
public class Program2 
{
public static void main(String[] args) 
{
System.out.println("main method started");

ArrayList al=new ArrayList();

al.add(new Student(1234, "ANVESH", 5));
al.add(new Mobile(143,"MI",21000));
al.add(new Laptop("HP",8));
al.add(new Student(1234, "ANVESH", 5));
al.add(new Mobile(143,"MI",21000));
al.add(new Laptop("HP",8));
al.add("JAVA");
al.add(null);
for(int i=0;i<al.size();i++)
{
	Object ob=al.get(i);
	System.out.println(ob);
}
System.out.println("main method ended");
}
}
