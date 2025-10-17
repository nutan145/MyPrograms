package com.nutan.streamAPI;

import java.util.List;

public class CountDemo3 {

	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Raj","Raj","Ravi","Virat","Raj");
		long count = listOfName.stream().distinct().count();
		System.out.println(count);

	}

}
