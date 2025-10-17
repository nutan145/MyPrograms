package com.nutan.abstracct;

abstract class Shape
{
	public abstract void draw();
}
class Rectangle extends Shape
{

	@Override
	public void draw() 
	{
		System.out.println("Rectangle drawing");	
	}
	
}
class Circle extends Shape
{

	@Override
	public void draw() 
	{
		System.out.println("Circle drawing");
		
	}
	
}
public class AbstractDemo1 
{

	public static void main(String[] args) 
	{
		Shape s=null;
		s=new Circle();s.draw();
		s=new Rectangle();s.draw();
		
	
		

	}

}
