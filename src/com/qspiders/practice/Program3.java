package com.qspiders.practice;

public class Program3 
{
public static void main(String[] args)
{
System.out.println("main method started");
//declaration of array
//DATATYPE []=arrayname;
int [] ar;
//memory allocation 
//arrayname []=new DATATYPE[int size];
ar =new int[5];
//initialization of array
//arrayname[index]=value;
ar[1]=15;
ar[2]=22;
ar[3]=05;
ar[4]=42;
ar[0]=14;
//utilization of array
System.out.println(ar[0]);
System.out.println(ar[1]);
System.out.println(ar[2]);
System.out.println(ar[3]);
System.out.println(ar[4]);
System.out.println("main method ended");
}
}

