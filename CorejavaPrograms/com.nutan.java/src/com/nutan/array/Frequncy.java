package com.nutan.array;


public class Frequncy 
{
	public static int[] printArray(int[] arr,int[] b)
	{
		System.out.println("Elements are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		return arr;
	}
	public static void groupFrequency(int[] arr,int[] b)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(b[i]!=-1)
			{
				int c=1;
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						c++;
						b[j]=-1;
					}
					b[i]=c;
				}
				
			}
		}
		for(int i=0;i<n;i++)
		{
			if(b[i]!=-1)
			{
				System.out.println(arr[i]+" Found "+b[i]+" times");
			}
		}
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,1,4,2,3,3,6};
		int [] b= {0,0,0,0,0,0,0,0};
		Frequncy.groupFrequency(arr, b);
		
	}

}
