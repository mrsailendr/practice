
public class SecondLargestElement {
	
	private static final int INT_MIN = 0;

	public static void main(String[] arg)
	{
		int[] arr= {5,5,2,1,-2};
		
		secodnLargest(arr);
	}

	private static void secodnLargest(int[] arr) {
		// TODO Auto-generated method stub
		
		int largest=0;	
		int secondlargest=largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest && arr[i] != largest)
			{
				secondlargest=arr[i];
			}
				
		}
		
		System.out.println("Second largest is:"+ secondlargest);
		
	}

}
