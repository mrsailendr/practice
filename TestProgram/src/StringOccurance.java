import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringOccurance {
	
	public static void main(String[] args) {
		
		String input="My name is Amarjith and I am working ITC infotech";
		
		checkCharOccurance(input);
		
	}

	private static void checkCharOccurance(String input) {
		// TODO Auto-generated method stub
		char[]arr=input.toCharArray();
		Map<Character,Integer> map1=new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
				continue;
			if(arr[i]>=97 && arr[i]<=122)
				arr[i]=(char) (arr[i]-32);
			if(map1.containsKey(arr[i]))
			{
				map1.put(arr[i], map1.get(arr[i])+1);
			}
			else
			{
				map1.put(arr[i], 1);
			}
		}
		
		System.out.println(map1);
		
		
	}

}
