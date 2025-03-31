import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] arg)
	{
		int a[]= {12,23,2,34,7,8,9,01,34};
		
		bubbleSorting(a);
		System.out.println(Arrays.toString(a));
	}

	private static void bubbleSorting(int[] a) {
		// TODO Auto-generated method stub
		
		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
							
				}
			}
		}
	}

}
