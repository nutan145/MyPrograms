package com.nutan.streamAPI;

interface worker
{
	void work();
}
public class MethodRefDemo1 
{

	public static void main(String[] args) 
	{
		worker w1=()->System.out.println("worker is working");
		w1.work();
		
		worker w2=new Employee1()::work;
		w2.work();

	}

}
class Employee1
{
	public void work()
	{
		System.out.println("Employee is Working");
	}
}