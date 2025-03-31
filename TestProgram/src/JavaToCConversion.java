
public class JavaToCConversion {
	
	public static void main(String arg[])
	{
		System.out.println(toConvert("thisIsAVariable"));
		System.out.println(toConvert("this_is_a_variable"));
	}
	
	public static String toConvert(String input)
	{
		
		String result="";
		
		if(input.contains("_"))
		{
			char ch[]=input.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='_')
				{
					i++;
					char ch1=Character.toUpperCase(ch[i]);
					result+=ch1;
				}
				else {
					result+=ch[i];
				}
					
			}
			return result;
		}
		else
		{
			char ch[]=input.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isUpperCase(ch[i]))
				{
					result+="_"+Character.toLowerCase(ch[i]);
				}
				else {
					result+=ch[i];
				}
			}
			
			return result;
		}
		
		
	}

}
