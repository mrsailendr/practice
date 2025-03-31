package Search;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] arg)
	{
		int a[]= {12,23,2,34,7,8,9,01,-9,-76,34};
		System.out.println(a.length);
		Arrays.parallelSort(a);
		boolean result=binarySearching(a,0,a.length-1,93);
		System.out.println(result);
	}

	private static boolean binarySearching(int[] a, int left, int right, int item) {
		// TODO Auto-generated method stub
		
		if(left<=right)
		{
			int mid=left+(right-left)/2;
			if(a[mid]==item)
			{
				return true;
			}
			else if(item<a[mid])
			{
				return binarySearching(a, left,mid-1, item);
			}
			else 
			{
				return binarySearching(a, mid+1, right, item);
			}
		}
		else
		{
		return false;
		}

	}

}
