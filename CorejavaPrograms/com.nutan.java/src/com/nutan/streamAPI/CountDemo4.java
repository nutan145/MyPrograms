package com.nutan.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountDemo4 {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Raj","Ravi","Rohit","Virat","Raj","Aradhya","scott");
		
		long count = list.stream().map(String::toUpperCase).filter(str->str.contains("A")).count();
		System.out.println(count);
	}

}
