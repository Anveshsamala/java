package com.homepractice;

public class Rahul4 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Rahul3 r3=new Rahul3(500, "JAI SRI RAM", 300);
System.out.println(r3.getnumbers());
System.out.println(r3.getpics());
System.out.println(r3.getmsgs());
r3.setnumbers(5000);
r3.setpics("JAI HANUMAN");
r3.setmsgs(3000);
System.out.println(r3.getnumbers());
System.out.println(r3.getpics());
System.out.println(r3.getmsgs());
System.out.println("main method ended");
}
}
