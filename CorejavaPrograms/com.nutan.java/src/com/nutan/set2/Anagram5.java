package com.nutan.set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram5 
{
	public static List<List<String>> groupAnagrams(String[] str)
	{
		Map<String, List<String>> map=new HashMap<>();
		
		for(String word:str)
		{
			char[] arr = word.toCharArray();
			Arrays.sort(arr);
			String key=new String(arr);
			
			map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args) 
	{
		String[] input= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> result = Anagram5.groupAnagrams(input);
		System.out.println(result);
		

	}

}
