package com.nutan.interfac;

interface Calculator
{
	double getSquareAndCube(int num);
}
public class LambdaDemo4 
{

	public static void main(String[] args) 
	{
		Calculator calc=num->
		{
			if(num<=0)
			{
				return -1;
			}
			else if(num %2==0)
			{
				return num*num;
			}
			else
			{
				return num*num*num;
			}
		};
		double squareAndCube = calc.getSquareAndCube(5);
		System.out.println(squareAndCube);

	}

}
