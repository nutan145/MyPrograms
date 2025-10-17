package com.nutan.abstracct;

abstract class Vehicle
{
	public abstract void run();
}
public class AnonymousInnerClassDemo1 
{

	public static void main(String[] args)
	{
		Vehicle car=new Vehicle()
		{
			public void run()
			{
				System.out.println("Car is running");
			}
		};
		car.run();
		
		Vehicle bike=new Vehicle()
		{
			public void run()
			{
				System.out.println("Bike is running");
			}
		};
		bike.run();
	}

}
