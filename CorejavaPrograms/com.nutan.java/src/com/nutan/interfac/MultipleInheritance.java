package com.nutan.interfac;

import java.awt.Image;

interface A
{
	void m1();
}
interface B
{
	void m1();
}
class implementer implements A,B
{

	@Override
	public void m1() 
	{
		System.out.println("Multiple inheritance is possible");	
	}
	
}
public class MultipleInheritance 
{

	public static void main(String[] args) 
	{
		implementer imp=new implementer();
		imp.m1();
	}

}
