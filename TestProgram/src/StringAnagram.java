import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] arg)
	{
		checkAnagram("team","meat");
		

	
	}

	private static void checkAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not an anagram");
			return;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("Not an angram");
				return;
			}
		}
		
		System.out.println("Strings are anagram");
	}

}
