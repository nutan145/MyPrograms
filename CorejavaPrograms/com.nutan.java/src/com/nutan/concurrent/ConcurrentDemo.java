package com.nutan.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Concurrent extends Thread
{
	private CopyOnWriteArrayList<String> cities=null;
	
	public Concurrent(CopyOnWriteArrayList<String> cities)
	{
		super();
		this.cities = cities;
	}

	@Override
	public void run()
	{
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		cities.add("Goa");
	}
}
public class ConcurrentDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		CopyOnWriteArrayList<String> listOfCity=new CopyOnWriteArrayList<String>();
		listOfCity.add("Hyderabad");
		listOfCity.add("pune");
		listOfCity.add("chennai");
		listOfCity.add("delhi");
		
		Concurrent con=new Concurrent(listOfCity);
		con.start();
		
		Iterator<String> it = listOfCity.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Thread.sleep(500);
		}
		
		System.out.println("=============================");
		Spliterator<String> spl = listOfCity.spliterator();
		spl.forEachRemaining(System.out::println);

	}

}
