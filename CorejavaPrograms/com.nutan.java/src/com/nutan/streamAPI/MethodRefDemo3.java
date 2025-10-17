package com.nutan.streamAPI;

@FunctionalInterface
interface Worker
{
	void work(double salary);
}

public class MethodRefDemo3
{
	public static void main(String[] args)
	{
	   Worker w1 = new Employeer()::salary;
	   w1.work(55000);

	}
}

class Employeer
{
	public void salary(double salary)
	{
		System.out.println("Employee Salary is :"+salary);
	}
}