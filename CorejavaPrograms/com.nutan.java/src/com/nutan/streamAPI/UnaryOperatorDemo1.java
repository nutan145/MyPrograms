package com.nutan.streamAPI;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo1 {

	public static void main(String[] args) 
	{
		UnaryOperator<String> unary=str->str.concat("world");
		String apply = unary.apply("hello ");
		System.out.println(apply);
		
		UnaryOperator<Integer> num=x->x*x;
		Integer res = num.apply(5);
		System.out.println(res);
	}

}
