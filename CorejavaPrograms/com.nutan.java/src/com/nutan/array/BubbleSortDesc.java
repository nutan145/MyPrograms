package com.nutan.array;

import java.util.Scanner;

public class BubbleSortDesc 
{
    public static int[] printArray(int[] arr)
    {
        System.out.println("Elements are :");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public static int[] bubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<=n-2; i++)
        {
            for(int j=0; j<=n-i-2; j++)
            {
                if(arr[j] < arr[j+1])   // ✅ fixed condition
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        BubbleSortDesc.bubbleSort(arr);
        BubbleSortDesc.printArray(arr);

        sc.close();
    }
}
