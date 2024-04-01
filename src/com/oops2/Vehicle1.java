package com.oops2;

public class Vehicle1 
{
private int nootyres;
private String vehiclename;
private double cost;
Vehicle1(int nooftyres, String vehiclename, double cost)
{
this.nootyres=nooftyres;
this.vehiclename=vehiclename;
this.cost=cost;
}
public int gettyres()
{
	return nootyres;
}
public String getnameofvehicle()
{
	return vehiclename;
}
public double getoverallcost()
{
	return cost;
}
public void settyres(int nootyres)
{
this.nootyres=nootyres;
}
public void setnameofvehicle(String vehiclename)
{
	this.vehiclename=vehiclename;
}
public void setoverallcost(double cost)
{
	this.cost=cost;
}
public static void main(String[] args) 
{
System.out.println("main method started");

Vehicle1 veh=new Vehicle1(14, "ashoklealand", 3000000);
System.out.println(veh.gettyres());
System.out.println(veh.getnameofvehicle());
System.out.println(veh.getoverallcost());

veh.settyres(16);
veh.setnameofvehicle("Bharathbenz");
veh.setoverallcost(3500000);

System.out.println(veh.gettyres());
System.out.println(veh.getnameofvehicle());
System.out.println(veh.getoverallcost());

System.out.println("main method ended");
}
}
