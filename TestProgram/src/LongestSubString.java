import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*given a string s, find the length of the longest substring without repeating characters.

Input: s = "pwwkew"
Output: 3

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.*/
public class LongestSubString {
	
	public static void main(String[] arg)
	{
		String str="pwwkewab";
		int len=longestUniqueSubsttr( str);
		
		System.out.println("Length="+len);
		
	}

	private static int longestUniqueSubsttr(String str) {
		// TODO Auto-generated method stub
		
		String test="";
		int maxLength=0;
		if(str.isEmpty())
		return 0;
		else if(str.length()==1)
		return 1;
		
		for(char c:str.toCharArray())
		{
			String current=String.valueOf(c);
			
			if(test.contains(current))
			{
				test=test.substring(test.indexOf(current)+1);
				//test="";
				System.out.println("Test Substring:"+test);
			}
			
			test=test+String.valueOf(c);	
			System.out.println("Test:"+test);
			maxLength=Math.max(maxLength, test.length());
			System.out.println("MaxLength :"+maxLength);
			
		}
		
		return maxLength;
	}
}
