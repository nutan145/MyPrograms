package com.nutan.array;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int[] arr=new int[size];
		int sum=0;
		double avg=0.0;
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
			avg=sum/arr.length;
		}
		System.out.println("avg is :"+avg);

	}

}
