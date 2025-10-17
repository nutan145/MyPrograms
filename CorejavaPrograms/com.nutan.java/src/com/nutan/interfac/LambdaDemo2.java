package com.nutan.interfac;

@FunctionalInterface
interface Calculate
{
	void doSum(int x,int y);
}
public class LambdaDemo2 {

	public static void main(String[] args) 
	{
		Calculate sum=(a,b)->System.out.println("Sum is :"+(a+b));
		sum.doSum(5, 10);

	}

}
