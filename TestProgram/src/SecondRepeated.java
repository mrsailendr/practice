import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondRepeated {
	
	public static void main(String[] arg)
	{
		String S="SUCCESS";
		Map<Character, Integer> map1= new HashMap<Character, Integer>();
		char[] arr=S.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
		if(map1.containsKey(arr[i]))
		{
			map1.put(arr[i],map1.get(arr[i])+1);
		}
		else
		{
			map1.put(arr[i],1);
			
		}
	}
	
	int flag=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(map1.get(arr[i])>1 && flag==0)
		{
			flag++;
			continue;
			
		}
		else if(map1.get(arr[i])>1 && flag==1)
		{
			System.out.println("2nd non repeated char= "+ arr[i]);
			flag=0;
			break;
		}
			
			
		
				
	}
	}

}
