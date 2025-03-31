
public class EqualizeArrayElementsApp {
	
	public static void main(String[] arg)
	{
		int[] a = new int[] { 123, 543 };
		int[] b = new int[] { 321, 279 };

		int countMove = countMoveToEqualArrayElements(a, b);
		
		System.out.println("Counter="+countMove);

	}

	private static int countMoveToEqualArrayElements(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int counter=0;
		if(a.length!=b.length)
			throw new RuntimeException("MAke sure two array of same length");
		
		
		for(int i=0;i<a.length;i++)
		{
			String s1=String.valueOf(a[i]);
			String s2=String.valueOf(b[i]);
			
			for(int j=0;j<s1.length();j++)
			{
				int val1=Integer.parseInt(Character.toString(s1.charAt(j)));
				int val2=Integer.parseInt(Character.toString(s2.charAt(j)));
				
				if(val1>val2)
				{
					counter=counter+val1-val2;
				}
				else
				{
					counter=counter+val2-val1;
				}
			}
		}
		
		return counter;
	}

}
