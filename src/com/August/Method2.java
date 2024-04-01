package com.August;

public class Method2 
{
public static void add(int a, int b)
{
	int sum=a+b;
	System.out.println(sum);
}
public static void main(String[] args) 
{
System.out.println("main method started");

add(3,5);
add(5,8);
add(10,10);

sub(14,85);
sub(24,67);
sub(78,96);

mul(14,58);
mul(44,55);
mul(99,36);

div(75,21);
div(1,6);
div(2,6);

search("anveshsamala5949@gmail.com",1234567890);

System.out.println("main method ended");
}
public static void sub(int c, int d)
{
	int sub=c-d;
	System.out.println(sub);
}

public static void mul(int e, int f)
{
	int mul=e*f;
	System.out.println(mul);
}

public static void div(int g, int h)
{
	int div=g/h;
	System.out.println(div);
}
public static void search(String username, int password)
{
	System.out.println(username);
	System.out.println(password);
}
}
