import java.util.HashMap;
import java.util.Map;

public class ReverseAstring {
	
	public static void main(String[] arg)
	{
		String s="ABCD";
		
		int [] intArr= {1,2,3,3,4,5,5,6,7,8};
		
		Map<Integer,Integer> map1=new HashMap<>();
		
		char[] charr=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(charr[i]);
		}
		
		
		for(int i=0;i<intArr.length;i++)
		{
			if(map1.containsKey(intArr[i]))
			{
				map1.put(intArr[i], map1.get(intArr[i])+1);
			}else
			{
				map1.put(intArr[i], 1);
			}
		}
		
		/*
		 * for(int i=0;i<intArr.length;i++) { if(map1.get(intArr[i])>1)
		 * System.out.println(intArr[i]); }
		 */
	
		
		
	}

}
