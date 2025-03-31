import java.util.Arrays;

public class SegregationOfZeroOne {
	
	public static void main(String[] arg)
	{
		int[] arr= {1,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1};
		
		segregate(arr);
		
	}

	private static void segregate(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int countzero=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
				countzero++;
		}
		
		for(int i=0;i<countzero;i++)
		{
			arr[i]=0;
		}
		for(int i=countzero;i<n;i++)
		{
			arr[i]=1;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
