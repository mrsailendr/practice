package Sorting;

/* The idea behind  is that is each iteration it consumes one element from the input element ,
 *  removes it and find its correct position 
 * i.e when it belongs in the sorted list and places it there
 * It iterate the array by growing the sorted list behind it at each iteration it check the c
 * current element with the largest value in the sorted list
 * 
 * If the current element is larger than it leaves the element at its place
 *  and move to the next element else it will find the correct position in the sorted list and 
 *  moves it to that position 
 *  IT is done by shifting all the element which are larger that the current element to one position */

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] arg)
	{
	int a[]= {12,23,2,34,7,8,9,01,-9,-76,34};
	
	insertionSorting(a);
	System.out.println(Arrays.toString(a));
	}

	private static void insertionSorting(int[] a) {
		// TODO Auto-generated method stub
		
		int n= a.length;
		
		for(int i=1;i<n;i++)
		{
			int temp=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>temp )
			{
				a[j+1]=a[j];
				j=j-1;
			}
			
			a[j+1]=temp;
			
		}
		
		
		
	}

}
