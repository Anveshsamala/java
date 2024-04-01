package com.auginheritance;

public class Methoverloading 
{
public void search(int a)
{
	System.out.println("interger argument");
}
public void search(String s1)
{
	System.out.println("String argument");
}
public void search(int b, String s2)
{
	System.out.println("int and String argument");
}
public void search(float f)
{
	System.out.println("float argument");
}
public static void main(String[] args) 
{
System.out.println("main method started");

Methoverloading ref=new Methoverloading();
ref.search("indian army");
ref.search(5846545);
ref.search(0.154484f);
ref.search(15545, "jai hind");

System.out.println("main method ended");
}
}
