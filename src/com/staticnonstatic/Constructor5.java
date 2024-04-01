package com.staticnonstatic;
class Arvind
{
	int a=89;
}
public class Constructor5 extends Arvind 
{
	int a;
	Constructor5()
	{
		a=55;
		System.out.println(super.a);
	}
	public static void main(String[] args) 
	{
	Constructor5 ref=new Constructor5();	

	}

}
