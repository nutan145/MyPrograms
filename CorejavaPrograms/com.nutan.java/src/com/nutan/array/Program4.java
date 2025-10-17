package com.nutan.array;

import java.util.Scanner;

public class Program4 
{

	public static void main(String[] args) 
	{
		int[] arr= {100,200,300,400,500,600};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positon to retrive the value at index 3 :");
		int pos = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(pos==i)
			{
				System.out.println("the value at "+pos+" rd index position is :"+arr[i]);
			}
		}

	}

}
