import java.util.Arrays;

public class TestHarman {
	
	public static void main(String[] args) {
		int[] arr= {1,-4,5,6,7,12,-5,6,7,8,-2,-7,-12};
		
		System.out.println("Demo");
		for(int i=0,j=arr.length-1;i<(arr.length-1)/2 && j>(arr.length)/2;)
		{
			if(arr[i]>0 && arr[j]<0)
			{
				int temp;
				temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
					
				i++;
				j--;
			}
			else if(arr[i]<0 && arr[j]<0)
			{
				i++;
			}
			else if(arr[i]>0 && arr[j]>0)
			{
				j--;
			}
			else
			{
				i++;
				j--;
			}
			
			System.out.println(Arrays.toString(arr));
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	

}
