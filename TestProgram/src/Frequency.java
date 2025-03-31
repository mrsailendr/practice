import java.util.HashMap;
import java.util.Map;

public class Frequency {
	
	public static void main(String[] arg)
	{
		String s="aabbcccdaab";
		//getFrequency(s);
		int[] arr= {1,-34,-50,-6,-8,9,45};
		getMax(arr);
		
		
	}
	
	static void getFrequency(String s)
	{
		Map<Character,Integer> m=new HashMap<Character, Integer>();
		char[] str=s.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(m.containsKey(str[i]))
			{
				m.put(s.charAt(i), m.get(str[i])+1);
				
			}
			else
			{
				m.put(str[i], 1);
				
			}
		}
		
		
		System.out.println(m);
		
		
		
		
		
	}
	
	static void getMax(int[] arr)
	{
		int max=arr[0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			
				
		}
		
		
		System.out.println(max);
		
		
		
		
		
	}
	

}
