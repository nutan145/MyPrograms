package com.nutan.collections;

import java.util.ArrayList;
import java.util.Vector;

//How to convert one collection object to another collection object :

public class LooseCoupling 
{

	public static void main(String[] args)
	{
		ArrayList<String> cityName = new ArrayList<>();
		cityName.add("Hyd");
		cityName.add("Bglr");
		cityName.add("Kolkata");
		
		//Convert this ArrayList into Vector
		Vector<String> listOfCity=new Vector<String>(cityName);
		System.out.println(listOfCity);
	}

}
