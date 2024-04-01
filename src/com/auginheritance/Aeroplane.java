package com.auginheritance;

public class Aeroplane implements Car,Rocket
{
public void moveonroad()
{
	System.out.println("car move on road");
}
public void fly()
{
	System.out.println("rocket move on air to fly");
}
}
