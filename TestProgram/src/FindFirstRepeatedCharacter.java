import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedCharacter {
	
	public static void main(String[] arg)
	{
		String s="amarjit";
		
		System.out.println("First Repeated character :"+findFirstRepeated(s));
	}

	private static char findFirstRepeated(String s) {
		// TODO Auto-generated method stub
		Set<Character> set1=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(set1.contains(s.charAt(i)))
			{
				return s.charAt(i);
			}
			else
			{
				set1.add(s.charAt(i));
			}
		}
		return '\0';
	}

}
