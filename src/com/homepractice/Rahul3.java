package com.homepractice;

public class Rahul3 
{
private int contacts;
private String photos;
private int messages;
public Rahul3(int contacts, String photos, int messages)
{
	this.contacts=contacts;
	this.photos=photos;
	this.messages=messages;
}
public int getnumbers()
{
	return contacts; 
}
public String getpics()
{
	return photos;
}
public int getmsgs()
{
	return messages;
}
public void setnumbers(int contacts)
{
	this.contacts=contacts;
}
public void setpics(String photos)
{
	this.photos=photos;
}
public void setmsgs(int messages)
{
	this.messages=messages;
}
}
