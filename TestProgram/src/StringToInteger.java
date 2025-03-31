import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringToInteger {
	
	public static void main(String[] args) {
		//System.out.println(stringToInt("1234578"));
		
		String s="programming";
		
		findDuplicate(s);
		}
	
	private static char[] findDuplicate(String s) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map=new HashMap<>();
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		System.out.println("Duplicate char are");
		
		Set set=map.keySet();
		Iterator itr= set.iterator();
		
		while(itr.hasNext())
		{
			char key= (char) itr.next();
			if(map.get(key)>1)
			{
				System.out.println(key+"="+ map.get(key));
			}
		}
		
		return null;
	}

	static int stringToInt(String s)
	{
		char[] arr=s.toCharArray();
		int sum=0;
		for(int i=0,j=arr.length;i<arr.length;i++,j--)
		{
			sum=(int) (sum+(arr[i]-48)*Math.pow(10,j-1));
			System.out.println(sum);
		}
		
		return sum;
		
	}

}
