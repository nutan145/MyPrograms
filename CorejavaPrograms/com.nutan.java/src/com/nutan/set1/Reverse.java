package com.nutan.set1;

public class Reverse {

	public static void main(String[] args) 
	{
		String original="Hello World";
		char[] chars = original.toCharArray();
		String reverse=" ";
		
		for(int i=chars.length-1;i>=0;i--)
		{
			reverse=reverse+chars[i];
		}
		System.out.println("original String :"+original);
		System.out.println("Reversed String :"+reverse);
	}

}
