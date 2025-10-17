package com.nutan.interfac;
sealed interface Moveable permits Car
{
	int SPEED = 90; //public + static + final
	void move();    //public + abstract
}
final class Car implements Moveable
{
	@Override
	public void move() 
	{
		//SPEED = 120; [Invalid]
		System.out.println("Car is moving with :"+SPEED+ " Speed!!");
	}
	
}
public class InterfaceDemo 
{

	public static void main(String[] args) 
	{
		Moveable m=new Car();
		m.move();
		System.out.println("Speed of the car is :"+Moveable.SPEED);

	}
}
