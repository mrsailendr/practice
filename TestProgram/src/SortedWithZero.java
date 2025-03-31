import java.util.Arrays;

public class SortedWithZero {
	
	public static void main(String[] args) {
		/*Input = [1, 9, 0, 6, 7, 0, 0]
output = [0,0,0,1,9,6,7]*/
		int[] arr= {1, 9, 0, 6, 7, 0, 0};
		
		getSorted(arr);
	}

	private static void getSorted(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		int []temp=new int[arr.length];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==0)
				count++;
			
		}
		
		for(int j=0;j<count;j++)
		{
			temp[j]=0;
		}
		
		for(int i=0,j=count+1;i<arr.length && j<arr.length;i++)
		{
			if(arr[i]>0)
			{
			temp[j]=arr[i];
			j++;
			}
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		
		
		
		
	/*	for(int i=0,j=arr.length-1;i<arr.length;)
		{
			int temp;
			if(arr[i]!=0 && arr[j]==0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else if(arr[i]==0)
				i++;
			else if(arr[j]!=0)
				j--;
			else
				i++;
				j--;
		}
		
		System.out.println(arr);
		
	}*/
	}

}
