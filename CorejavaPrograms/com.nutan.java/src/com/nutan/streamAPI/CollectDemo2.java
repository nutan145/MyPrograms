package com.nutan.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo2 {

	public static void main(String[] args)
	{
		List<String> items = Arrays.asList("Delhi", "Indore", "Kolkata", "Pune", "Hyderabad","Mumbai","Chennai");
		Map<Integer, List<String>> collect = items.stream().collect(Collectors.groupingBy(String::length));
		collect.forEach((len,cities)->System.out.println(len+" : "+cities));

	}

}
