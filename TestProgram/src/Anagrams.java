import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	public static void main(String[] args) {
		
		String arr[] =  {"cat", "dog", "tac", "god", "act"};

		printAnagrams(arr);
	}

	private static void printAnagrams(String[] arr) {
		// TODO Auto-generated method stub
		Map<String, List<String>> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			char[] word=arr[i].toCharArray();
			Arrays.sort(word);
			
			
		}
	}

}
