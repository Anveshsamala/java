package com.August;

public class Siobjmul 
{
int a=5555;

public static void main(String[] args) 
{
System.out.println("main method started");

Siobjmul ref=new Siobjmul();
System.out.println(ref.a);

Siobjmul ref1=ref;
System.out.println(ref1.a);

Siobjmul ref2=ref1;
System.out.println(ref2.a);

Siobjmul ref3=ref2;
System.out.println(ref3.a);


System.out.println("main method ended");
}
}
