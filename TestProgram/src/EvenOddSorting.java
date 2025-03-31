import java.util.Arrays;

public class EvenOddSorting {
	
	public static void main(String[] arg)
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int start=0;
		int end=arr.length-1;
		
		while(start!=end)
		{
			if((arr[start]%2!=0) && (arr[end]%2==0))
			{
				int temp;
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				start++;
				end--;
			}
			else if(arr[start]%2==0)
				start++;
			else if(arr[end]%2!=0)
				end--;
		}
		
		System.out.println(Arrays.toString(arr));
		int mid=0;
		while(arr[mid]%2==0)
			mid++;
		
		Arrays.sort(arr, 0, mid);
		Arrays.sort(arr,mid,arr.length);
		
		System.out.println("After sorting="+Arrays.toString(arr));
	}

}
