package com.oops1;
interface Interfacename  //////default public abstract
{
	public static final int a=100;  ////default public static final
	public abstract void start();   /////default public abstract
	public abstract void end();
}
class Implemen 
{
	public void start()
	{
		System.out.println("start method implentation in sub class");
	}
}
class Impleee extends Implemen
{
	public void end()
	{
		System.out.println("End method implementation in sub class");
	}
}
public class Interffaccee 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Impleee im=new Impleee();
System.out.println("a="+Interfacename.a);
im.start();
im.end();


System.out.println("main method ended");
}
}
