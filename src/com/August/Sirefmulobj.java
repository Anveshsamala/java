package com.August;

public class Sirefmulobj 
{
int a=5622;
public static void main(String[] args) 
{
System.out.println("main method started");

Sirefmulobj ref=new Sirefmulobj();
System.out.println(ref.a);

ref.a=2467;
System.out.println(ref.a);

ref=new Sirefmulobj();
System.out.println(ref.a);

ref.a=8793;
System.out.println(ref.a);

ref=new Sirefmulobj();
System.out.println(ref.a);

System.out.println("main method ended");
}
}
