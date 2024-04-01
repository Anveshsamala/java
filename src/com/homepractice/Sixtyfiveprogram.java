package com.homepractice;
class Auto
{
	int a=10;
	public void travelling()
	{
		System.out.println("travel only four members");
	}
}
public class Sixtyfiveprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Auto ref=new Auto();
ref.travelling();
System.out.println("a= "+ref.a);

int a=55;
System.out.println("a= "+a);

ref=new Auto();
ref.travelling();
System.out.println("a= "+ref.a);
ref.a=478;
System.out.println("a= "+a);

ref=new Auto();
ref.travelling();
System.out.println("a= "+a);
ref.a=5647;
System.out.println(a);




System.out.println("main method ended ");
}
}
