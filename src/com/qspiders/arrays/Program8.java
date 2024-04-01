package com.qspiders.arrays;

import java.util.ArrayList;

public class Program8 
{
public static void main(String[] args) 
{
System.out.println("main method started");

ArrayList al=new ArrayList();
al.add(new Student1(23,"java",3));
al.add(new Mobile(4566,"MI",89));
al.add(new Laptop("HP",87));
al.add(new Student1(345,"testing",1));
al.add(new Mobile(345,"VIVO",5));
al.add(new Laptop("LENOVO",34));
al.add("SQL");
al.add("TESTING");
al.add(null);
for(int i=0;i<al.size();i++)
{
	Object ob=al.get(i);
	System.out.println(ob);
}

System.out.println("main method ended");
}
}
