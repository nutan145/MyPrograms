package com.nutan.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo1 {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("a","b","c","d","e");
		String collect = list.stream().collect(Collectors.joining("$"));
		System.out.println(collect);

	}

}
