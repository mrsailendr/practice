import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class secondLargest {
	

	public static void main(String[]arg)
	{
		int arr[] = {12, 35, 1, 10, 34, 1};
		secondLargestElement(arr);
		int arr1[] = {-1, -2, -3, -4, -5};
		secondLargestElement(arr1);
		int arr2[] = {10, 5, 10};
		secondLargestElement(arr2);
		int arr3[] = {10, 10, 10};
		secondLargestElement(arr3);
		
		
		
	}
	
	static void secondLargestElement(int[] arr)
	{
		int largest=arr[0],secondLargest=arr[1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(secondLargest>largest)
			{
				int temp;
				temp=secondLargest;
				secondLargest=largest;
				largest=temp;
			}
			if(arr[i]>=largest)
			{
			
				largest=arr[i];
				//secondLargest=largest;
			}
			else if(arr[i]>=secondLargest)
			{
				secondLargest=arr[i];
			}
					
				
			
		}
		
		System.out.println(secondLargest);
	}
	
	
	//

]
		
		static void peformAction(String[] arr)
		{
			
			
			
		}

}
