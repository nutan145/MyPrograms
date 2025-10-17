package com.nutan.abstracct;

class Super
{
	public void show()
	{
		System.out.println("Super class show method");
	}
}
public class AnonymousInnerClass 
{

	public static void main(String[] args) 
	{
		Super sub=new Super()
		{
			@Override
			public void show()
			{
				System.out.println("sub class show method");
			}
		};
		sub.show();
		Super sub1=new Super()
		{
			public void show()
			{
				System.out.println("Sub1 class show method");
			}
		};
		sub1.show();

	}

}
