package com.homepractice;
public class Rahul2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Rahul1 r=new Rahul1(2000, "SAMALA", 1000);
System.out.println(r.getcontacts());
System.out.println(r.getphotos());
System.out.println(r.getmessages());
r.setcontacts(3000);
r.setphotos("DAUVGALLA");
r.setmessages(5000);
System.out.println(r.getcontacts());
System.out.println(r.getphotos());
System.out.println(r.getmessages());
System.out.println("main method ended");
}
}
