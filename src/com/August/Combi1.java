package com.August;

public class Combi1 
{
int a=45879;
int b=461793;
public static void main(String[] args) 
{
System.out.println("main method started");

Combi1 a=new Combi1();
System.out.println(a.a);

Combi1 aa=a;
System.out.println(aa.a);
                             /////////////Single object multiple reference variable
Combi1 aaa=aa;
System.out.println(aaa.a);

Combi1 aaaa=aaa;
System.out.println(aaaa.a);





Combi1 ref=new Combi1();
System.out.println(ref.a);

ref.a=77777;
System.out.println(ref.a);

ref=new Combi1();
System.out.println(ref.a);

ref.a=8888;
System.out.println(ref.a);        /////Single reference variable multiple objects

ref=new Combi1();
System.out.println(ref.a);

ref.a=696969;
System.out.println(ref.a);

ref=new Combi1();
System.out.println(ref.a);
System.out.println("main method ended");
}
}
