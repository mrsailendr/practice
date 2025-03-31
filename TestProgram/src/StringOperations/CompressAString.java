package StringOperations;

public class CompressAString {
	
	public static void main(String[] arg)
	{
		String s="aabbbbbccccceee";
		
		compressString( s);
	}

	private static void compressString(String s) {
		// TODO Auto-generated method stub
		int count;
		int i,j;
		String comp="";
		for(i=0;i<s.length();i++)
		{
			count=0;
			for( j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
				else
					break;
			}
			
			comp=comp+count+s.charAt(i);
			i=j-1;
		}
		
		System.out.println(comp);
	}

}
