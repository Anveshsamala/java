package com.homepractice;

import java.util.ArrayList;

public class Arraylist1 
{
public static void main(String[] args) 
{
System.out.println("main method started");

ArrayList al=new ArrayList();
System.out.println(al.size());
al.add("java");
al.add("testing");
al.add("selenium");
al.add("sql server");
al.add("preparing");
al.add("interview");
al.add("java");
al.add("java");
al.add("testing");
al.add("null");
al.add("null");
al.add("joining fixed");
System.out.println(al.size());

for(int i=0;i<al.size();i++)
{
	Object ob=al.get(i);
	System.out.println(ob);
}

System.out.println("main method ended");
}
}
