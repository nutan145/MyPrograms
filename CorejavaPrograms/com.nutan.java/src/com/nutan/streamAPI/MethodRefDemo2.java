package com.nutan.streamAPI;

interface workerr
{
	void work();
}
public class MethodRefDemo2
{

	public static void main(String[] args) 
	{
		workerr w1=Employee2::work;
		w1.work();

	}

}
class Employee2
{
	public static void work()
	{
		System.out.println("Employee is Working");
	}
}