package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] arg)
	{
	int a[]= {12,23,2,34,7,8,9,01,-9,-76,34};
	
	mergeSorting(a,0,a.length-1);
	System.out.println(Arrays.toString(a));
	}

	private static void mergeSorting(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end)
		{
			int mid=(start+end)/2;
			mergeSorting(a,start,mid);
			mergeSorting(a, mid+1, end);
			
			merge(a,start,mid,end);
		}
		
	}

	private static void merge(int[] a, int start, int mid, int end) {
		// TODO Auto-generated method stub
		
		int p=start,q=mid+1;
		int arr[] = new int [end-start+1];
		int k=0;
		
		for(int i=start;i<=end;i++)
		{
			if(p>mid)
				arr[k++]=a[q++];
			else if(q>end)
				arr[k++]=a[p++];
			else if(a[p]<a[q])
				arr[k++]=a[p++];
			else
				arr[k++]=a[q++];
		}
		
		for(int r=0;r<k;r++)
		{
			a[start++]=arr[r];
		}
		
			
		
	}

}
