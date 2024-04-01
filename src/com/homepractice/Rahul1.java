package com.homepractice;

public class Rahul1 
{
private int noofcontacts;
private String gallary;
private int noofmessages;
public Rahul1(int noofcontacts, String gallary, int noofmessages)
{
	this.noofcontacts=noofcontacts;
	this.gallary=gallary;
	this.noofmessages=noofmessages;
}
public int getcontacts()
{
	return noofcontacts;
}
public String getphotos()
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
public void setphotos(String gallary)
{
	this.gallary=gallary;
}
public void setmessages(int noofmessages)
{
	this.noofmessages=noofmessages;
}
}
