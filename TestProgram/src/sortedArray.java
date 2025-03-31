
import java.util.HashSet;
import java.util.Set;

public final class sortedArray {
	
	public static void main(String[] arg)
	{
		int[] a = {1,10,15,20,25,26,27};
		int[] b = {2,3,8,12,18};

		//		output [1,2,3,8,10,12,15,18,20]
		
		getSorted1(a, b);
						
	}
	
	
	static void getSorted(int[] a,int[] b)
	{ 
		//Set<Integer> s1= new HashSet<>();
		int [] output=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			output[i]=a[i];
		}
		
		for(int i=0,j=a.length;i<b.length;i++,j++)
		{
			output[j]=b[i];
		}
		
		for(int i=0;i<output.length;i++)
		{
			for(int j=i;j<output.length;j++)
			{
				if(output[i]>output[j])
				{
					int temp;
					temp=output[i];
					output[i]=output[j];
					output[j]=temp;
				}
			}
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
		
	}
	
	
	static void getSorted1(int[] a,int[] b)
	{ 
		//Set<Integer> s1= new HashSet<>();
		int [] output=new int[a.length+b.length];
		for(int i=0,j=0,k=0;i<a.length && j<b.length && k < output.length;k++)
		{
			if(a[i]<b[j])
			{
				output[k]=a[i];
				System.out.println(output[k]);
				i++;
			}
			else if(b[j]>a[i])
			{
				output[k]=b[j];
				System.out.println(output[k]);
				j++;
			}

		}
		

		for(int i=0;i<output.length;i++)
		{
			//System.out.println(output[i]);
		}
		
	}

}
