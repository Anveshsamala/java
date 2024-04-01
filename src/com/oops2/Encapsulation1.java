package com.oops2;

public class Encapsulation1 
{
private int noofcontacts;
private String gallary;
private int noofmessages;
public Encapsulation1(int noofcontacts, String gallary, int noofmessages)
{
	this.noofcontacts=noofcontacts;
	this.gallary=gallary;
	this.noofmessages=noofmessages;
}
public int getcontacts()
{
	return noofcontacts;
}
public String getgallary()
{
	return gallary;
}
public int getmessages()
{
return noofmessages;	
}
public void setcontacts(int noofcontacts)
{
	this.noofcontacts=noofcontacts;
}
public void setgallary(String gallary)
{
	this.gallary=gallary;
}
public void setmessages(int noofmessages)
{
	this.noofmessages=noofmessages;
}
public static void main(String[] args) 
{
System.out.println("main method started");

Encapsulation1 ref=new Encapsulation1(500, "anvesh", 1000);
System.out.println(ref.getcontacts());
System.out.println(ref.getgallary());
System.out.println(ref.getmessages());

ref.setcontacts(1000);
ref.setgallary("rahul");
ref.setmessages(2000);

System.out.println(ref.getcontacts());
System.out.println(ref.getgallary());
System.out.println(ref.getmessages());

System.out.println("main method ended");
}
}
