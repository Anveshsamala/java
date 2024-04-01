package com.homepractice;
class Hashcode2
{
	@Override
	public int hashCode()
	{
		return 143;
	}
}
public class Hashcode1 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	Hashcode2 hs=new Hashcode2();
	int hs1=hs.hashCode();
	System.out.println(hs1);
	
	System.out.println("main method ended");
}
}
