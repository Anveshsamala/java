package com.auginheritance;

import java.sql.Ref;

public class Program4 
{
public void end1(Program1 ref1)
{
	ref1.test();
}
public void end2(Program2 ref2)
{
	ref2.test();
	ref2.disp();
	ref2.start();
}
public void end3(Program3 ref3)
{
	System.out.println(ref3.a);
	System.out.println(ref3.b);
	ref3.disp();
	ref3.start();
	ref3.test();
}
}
