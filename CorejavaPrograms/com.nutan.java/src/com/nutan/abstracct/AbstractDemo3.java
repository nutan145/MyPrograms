package com.nutan.abstracct;

abstract class Shape
{
	protected String shapeType;

	public Shape(String shapeType) 
	{
		super();
		this.shapeType = shapeType;
	}
	
	public abstract void draw();	
}

class Rectangle extends Shape
{	
	public Rectangle(String shapeType)
	{
		super(shapeType);
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing "+shapeType);
	}
}

class Circle extends Shape
{
	public Circle(String shapeType)
	{
		super(shapeType);
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing "+shapeType);
	}
}

public class AbstractDemo3 
{
	public static void main(String[] args) 
	{
		Shape ss = new Rectangle("Rectangle");
		ss.draw();
		
		ss = new Circle("Circle");
		ss.draw();

	}

}