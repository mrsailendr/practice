import java.util.Arrays;

public class test11 {
	
	public static void main(String[] args) {
		
	//	{1, 5, 7, 9,10, 15,8,3} --> find max water any bucket(2 indexes) can store (Length * height)
		/**/
		
		int[] arr={1, 5, 7, 9,10, 15,8,3};
		int maxwater=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				maxwater= Math.max(maxwater, Math.min(arr[j],arr[i])*(j-i));
			}
		}
		
		//Arrays.parallelSort(arr);
		
		//for(int i=0;i<arr.length;i)
		
		
	}
	
	

}


//LRU,LFU,


