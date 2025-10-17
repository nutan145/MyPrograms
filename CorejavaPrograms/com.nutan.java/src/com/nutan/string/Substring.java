package com.nutan.string;

public class Substring {

	public static void main(String[] args) 
	{
		String str="Hyderabad";
		System.out.println(str.substring(3));//erabad
		System.out.println(str.substring(2, 6));//dera
		System.out.println(str.substring(5, 2));// java.lang.StringIndexOutOfBoundsException
		System.out.println(str.substring(3, 3));//NOTHING
		System.out.println(str.substring(0, -3));//SIOBE
	}

}
