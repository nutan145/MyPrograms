package com.nutan.array;

import java.util.Scanner;



import java.util.Scanner;

public class SelectionSortingAsc 
{
    // Method to print array
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

    // Selection sort method
    public static int[] selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)   // ✅ changed n-2 → n-1
        {
            for(int j=i+1; j<n; j++)  // ✅ changed n-1 → n
            {
                if(arr[i] > arr[j])
                {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
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

        // ✅ Call selection sort first
        SelectionSortingAsc.selectionSort(arr);

        // ✅ Then print sorted array
        SelectionSortingAsc.printArray(arr);

        sc.close();
    }
}
