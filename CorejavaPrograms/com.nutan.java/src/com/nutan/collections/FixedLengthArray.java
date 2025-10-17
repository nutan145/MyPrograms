package com.nutan.collections;

import java.util.Arrays;
import java.util.List;

//we cant add or remove but we can replace new element with existing element
public class FixedLengthArray 
{

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        //numbers.add(9);  //Invalid [java.lang.UnsupportedOperationException]
		numbers.set(0, 100);
		System.out.println(numbers);

	}

}
