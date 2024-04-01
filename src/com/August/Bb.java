package com.August;

public class Bb 
{
String s1="anvesh";
public static void main(String[] args) 
{
System.out.println("main method started");

B reff=new B();
System.out.println(reff.a);
System.out.println(reff.f);
reff.red();
reff.a=555;
System.out.println(reff.a);

Bb refff=new Bb();
System.out.println(refff.s1);
refff.s1="AAAAAAAA";
System.out.println(refff.s1);



System.out.println("main methood ended");
}
}
