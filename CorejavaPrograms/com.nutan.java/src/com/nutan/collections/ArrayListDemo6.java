package com.nutan.collections;

import java.util.ArrayList;

public class ArrayListDemo6 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<>(); //Generic type
		al.add(12);
		al.add("Ravi");
		al.add(12);		
		al.add(3,"Hyderabad"); 
		al.add(1,"Naresh");
		al.add(null);
		al.add(11);
		System.out.println(al);  //12 Naresh Ravi  12  Hyderabad null  11
	}

}
