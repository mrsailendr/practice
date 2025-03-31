import java.util.Arrays;

public class RemovingDuplicateFromAnArray {
	
	public static void main(String[] arg)
	{
		int[] arr= {1,2,3,4,5,6,7,8,2,1};
		
		removeDuplicate(arr);
	}

	private static void removeDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		if(arr.length==0 || arr.length==1)
			return;
		int[] temp= new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				temp[j++]=arr[i];
		}
		
		temp[j++]=arr[arr.length-1];
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}

}
