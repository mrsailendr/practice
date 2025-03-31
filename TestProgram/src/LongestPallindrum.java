
public class LongestPallindrum {
	
	public static void main(String[] args) {
		
		
		//Find longest Palindrome GHABCDEFEDCBAXFA
		String s="GHBCDEFEDCBAXFA";
		
		findLongestPallindrum(s);
		
	}

	 static void findLongestPallindrum(String s) {
		// TODO Auto-generated method stub
		char [] arr=s.toCharArray();
		int len=0;
		String ls="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-2;j++)
			{
				 int ret=pallindrum(s.substring(i, j));
				 
				 			 
				 if(ret>0 && ret>ls.length())
					 ls=s.substring(i, j);
				 
			}
		}
		
		System.out.println("Longest Substring: "+ls);
				
		 
		
		
	}
	
	static int pallindrum(String s)
	{
		int len=s.length();
		char[] arr=s.toCharArray();
		
		for(int i=0,j=len-1;i<len-1 && j>0 ;i++,j--)
		{
			if(arr[i]!=arr[j])
				return -1;
		}
		
		return len;
	}

}
