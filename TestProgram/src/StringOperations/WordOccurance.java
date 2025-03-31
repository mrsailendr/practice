package StringOperations;

public class WordOccurance {
	
	public static void main(String[] arg)
	{
		String str="Geeks for Geek gGeek Geek";
		String substring="Geek";
		System.out.println(str);
		int count= countSubstring(str,substring);
		System.out.println("Count="+count);
	}

	public static int countSubstring(String str, String substring) {
		// TODO Auto-generated method stub
		
		int len1=str.length();
		int len2=substring.length();
		int count1=0;
		char[] chstr=str.toCharArray();
		char[] chsub=substring.toCharArray();
		
		for(int i=0;i<len1;)
		{
			int j=0,count=0;
			
			while(j<len2 && chstr[i]==chsub[j])
			{
				i++;
				j++;
				count++;
			}
			
			if(count== len2)
			{
				count1++;
				count=0;
			}else
			{
				i++;
			}
			
		}
		return count1;
	}

}
