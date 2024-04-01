package com.stringsixteenmarch;

public class String2 
{
	@Override
	public String toString()
	{
	return "OVERRIDE TOSTRING METHOD";	
	}
	@Override
	public int hashCode()
	{
		return 15;
	}
	
public static void main(String[] args) 
{
String2 s1=new String2();
System.out.println(s1.toString());

String2 s2=new String2();
System.out.println(s1==s2);
System.out.println(s1.equals(s2));

//System.out.println(s1.toString());


}
}
