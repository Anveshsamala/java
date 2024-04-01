package com.staticnonstatic;
	

public class Blockk1 
{
	int a;
	{
		System.out.println("excuting blocks");
		a=45;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		
	System.out.println(new Blockk1().a);	
	System.out.println("main method ended");
	}
}
