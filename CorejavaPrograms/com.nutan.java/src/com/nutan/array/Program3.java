package com.nutan.array;

import java.util.Random;
import java.util.Scanner;

public class Program3 
{
	public static void printArray(int[] arr)
	{
		System.out.print("Elements are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			int min=1;
			int max=100;
			Random rand=new Random();
			arr[i]=rand.nextInt(min, max);
		}
		printArray(arr);
	
	}

}
