package com.staticnonstatic;
class Rahul1
{
	int a;
	Rahul1()
	{
		a=748;
		System.out.println(a);
	}
}
public class Constructor6 extends Rahul1
{
	String s1;
Constructor6(String s1)
{
	super();
	System.out.println(s1);
}
	public static void main(String[] args) 
	{
		Constructor6 ref=new Constructor6("raju....");

	}

}
