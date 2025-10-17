package com.nutan.interfac;

@FunctionalInterface
interface length
{
	int getLength(String str);
}
public class LambdaDemo3 
{

	public static void main(String[] args) 
	{
		length l=str->str.length();
		System.out.println("Length is :"+l.getLength("Nutan"));

	}

}
