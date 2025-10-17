package com.nutan.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo3 
{

	public static void main(String[] args) 
	{
		 List<String> listOfCountry = List.of("India","Australia","USA","China","Japan");
		 Map<String, Integer> map = listOfCountry.stream().collect(Collectors.toMap(
				 countryname->countryname,
				 countryname->countryname.length()));
		 map.forEach((key,value)->
		 {
			 System.out.println(key+" : "+value);
		 });
		 
	}

}
