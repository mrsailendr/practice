import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] arg)
	{
		int a[]= {12,23,2,34,7,8,9,01,-9,-76,34};
		
		selectionSorting(a);
		System.out.println(Arrays.toString(a));
	}

	private static void selectionSorting(int[] a) {
		// TODO Auto-generated method stub
		
		int n=a.length;
		int min;
		
		for(int i=0;i<n-1;i++)
		{
			min=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min=j;
					
			}
			
			int temp;
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			//swap(a[min],a[i]);
		}
		
	}

	/*
	 * private static void swap(int a, int b) { // TODO Auto-generated method stub
	 * int temp; temp=a; a=b; b=temp;
	 * 
	 * }
	 */

}

