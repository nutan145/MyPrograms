package com.nutan.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class RetrievingCollectionObject
{

	public static void main(String[] args) 
	{
		Vector<String>fruits=new Vector<String>();
		fruits.add("orange");
		fruits.add("Apple");
		fruits.add("Mango");    
		fruits.add("Banana");
		fruits.add("Gauva");  
		
		System.out.println(fruits.toString());//by using tostring method
		
		System.out.println();
		//by using for loop
		
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		System.out.println();
		//by using for each method
		
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println();
		//by using enumeration
		Enumeration<String> elements = fruits.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
		
		System.out.println();
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		ListIterator<String> lt = fruits.listIterator();
		System.out.println("in forward direction only");
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("in backward direction only");
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		System.out.println();
		//by using splIterator
		fruits.forEach(str->System.out.println(str));
		
		System.out.println();
		//by using for each method
		fruits.forEach(fruit->System.out.println(fruit));
		
		System.out.println();
		//by using method reference
		fruits.forEach(System.out::println);
	}

}
