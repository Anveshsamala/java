package com.qspiders.practice;

import java.util.ArrayList;

public class ProgramArrayList 
{
public static void main(String[] args) 
{
System.out.println("main method started");
ArrayList al=new ArrayList();
System.out.println("size="+al.size());
al.add("java");
al.add("testing");
al.add("sql");
al.add("selenium");
al.add("groming");
al.add("mock");
al.add("mock");
al.add("mock");
al.add("core java");
al.add("aptitude");
al.add(null);
System.out.println("size="+al.size());
for(int i=0;i<al.size();i++)
{
Object ob=al.get(i);
System.out.println(ob);
}
System.out.println("main method ended");
}
}
