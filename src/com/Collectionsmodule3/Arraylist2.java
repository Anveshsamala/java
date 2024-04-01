package com.Collectionsmodule3;

import java.util.ArrayList;

public class Arraylist2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
ArrayList ar=new ArrayList();
System.out.println(ar.size());
ar.add("java");
ar.add("testing");
ar.add("selenium");
ar.add("SQL");
ar.add("preparation");
ar.add("interview");
ar.add("selected");
ar.add("java");
ar.add("testing");
System.out.println(ar.size());
for(int i=0; i<ar.size();i++)
{
	Object ob=ar.get(i);
	System.out.println(ob);
}
System.out.println("main method ended");
}
}
