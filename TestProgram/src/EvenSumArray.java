
public class EvenSumArray {
	
	public static void main(String[] arg)
	{
		int [] a= {-2,-3,8,9,12,3,5,2,1,9,7};
		
		int sum=findEvenSum(a);
		
		System.out.println("Even Sum"+sum);
		
	}

	private static int findEvenSum(int[] a) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=0;i<a.length;i++)
			total=total+a[i];

		if(total%2==0)
			return total;
		
		int lastOdd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1 && (lastOdd==0 || lastOdd<a[i]))
			{
				total=total+lastOdd;
				total=total-a[i];
				lastOdd=a[i];
			}
		}
		
		return total;
	}

}
