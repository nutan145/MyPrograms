package com.nutan.abstracct;
abstract class Bike
{
	protected int speed=60;
	
	public Bike()
	{
		System.out.println("Generic Bike");
	}
	public void getBikeDetails()
	{
		System.out.println("it is two wheelers");
	}
	public abstract void run();
}
class Honda extends Bike
{

	@Override
	public void run()
	{
		System.out.println("Bike is running");
		
	}
	
}
public class AbstractDemo2 
{

	public static void main(String[] args) 
	{
		Bike obj=new Honda();
		System.out.println("Bike Speed :"+obj.speed);
		obj.getBikeDetails();
		obj.run();
	}

}
