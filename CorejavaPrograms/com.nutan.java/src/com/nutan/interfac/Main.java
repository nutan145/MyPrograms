package com.nutan.interfac;

interface Hotdrink
{
	void prepare();
}
class Tea implements Hotdrink
{
	@Override
	public void prepare()
	{
		System.out.println("Tea is preparing");	
	}
}
class Cofee implements Hotdrink
{
	@Override
	public void prepare()
	{
		System.out.println("Cofee is preparing");	
	}
}
class Horlicls implements Hotdrink
{
	@Override
	public void prepare()
	{
		System.out.println("Horlicks is preparing");	
	}
}
class Resturant
{
	public static void acceptObject(Hotdrink hd)
	{
		hd.prepare();
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Resturant.acceptObject(new Tea());
		Resturant.acceptObject(new Cofee());
		Resturant.acceptObject(new Horlicls());
	}

}
