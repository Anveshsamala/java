package com.jspiders.Threads;
interface Sample1
{
void zoom(int a,int b);
}
public class Program6 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Sample1 ref2=(int a,int b)->
{
System.out.println("providing implementation for call method in lamda expression");	
System.out.println(a+b);
};
ref2.zoom(4, 15);

System.out.println("mainmethod ended");
}
}
