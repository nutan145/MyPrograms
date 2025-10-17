package com.nutan.streamAPI;

import java.util.List;

public class CountDemo2 {

	public static void main(String[] args)
	{
		List<String> listOfName = List.of("Raj","Ravi","Virat","Rohit","Ram","Bumrah","Sachin");
		long count = listOfName.stream().filter(name->name.length()>3).count();
		System.out.println(count);

	}

}
