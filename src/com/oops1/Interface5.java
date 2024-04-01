package com.oops1;
interface Rocket
{
	void fly();
}
interface Car
{
	void moveOnGround();
}
class Aeroplane implements Rocket,Car
{
public void fly()
{
System.out.println("fly method implementation");	
}
public void moveOnGround()
{
System.out.println("moveOnGround method implementation");	
}
}
public class Interface5 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Aeroplane a1=new Aeroplane();
a1.fly();
a1.moveOnGround();
System.out.println("main method ended");
}
}
