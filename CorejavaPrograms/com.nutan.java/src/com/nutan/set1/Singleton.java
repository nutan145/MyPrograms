package com.nutan.set1;

public class Singleton 
{
	private static Singleton instance;
	
	private Singleton()
	{
		System.out.println("singleton constructor");
	}
	
	private static synchronized Singleton getInstance()
	{
		if(instance==null)
		{
			instance=new Singleton();
		}
		return instance;
	}
	public void showMessage()
	{
		System.out.println("Singleton class Method");
	}
	public static void main(String[] args) 
	{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1==obj2);
		obj1.showMessage();
	}

}
