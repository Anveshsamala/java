package com.homepractice;

public class Stringclass7 
{
public static void main(String[] args) 
{
System.out.println("main method started");

String s1="Independanceday";
System.out.println("s1="+s1);

System.out.println(s1.toCharArray()); //converted to array elements

System.out.println(s1.charAt(3));  //finding the exact element

System.out.println(s1.toUpperCase());//covert to upper case

System.out.println(s1.toLowerCase());//convert to lower case

System.out.println(s1.substring(4));//display that element to end of the index

System.out.println(s1.substring(2, 6));//display selected  start index to ended index -1


System.out.println("main method ended");
}
}
