
public class TestSubset {
	
	public static void main(String[] arg)
	{
			int	a1 [] = {2,5,1,100, 45, 201, 23, 67, 89};
			int	a2[] = {201, 23, 67};
			int	a3[] = {201, 67, 89};
			System.out.println(checkSubset(a1,a2));
			System.out.println(checkSubset(a1,a3));
			
	}
	
	static boolean checkSubset(int[] arr, int[] subset)
	{
		int counter=0;
		int temp[]=new int[arr.length];
		for(int i=0,j=0;i<arr.length && j<subset.length ;i++)
		{
			if((arr[i]== subset[j]))
			{
				temp[i]=arr[i];
				j++;
				
			}
		}
		
		/*if(counter==subset.length)
			return true;
		else
			return false;*/
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==temp[i])
				counter++;	
		}
		
		if(counter==subset.length)
		return true;
	else
		return false;
		
	}	
		
	

}
