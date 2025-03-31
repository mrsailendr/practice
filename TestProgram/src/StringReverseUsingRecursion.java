
public class StringReverseUsingRecursion {
	
	public static void main(String[] arg)
	{
		String s="Amarjit";
		reverse(s);
	}

	private static void reverse(String str) {
		// TODO Auto-generated method stub
		if(str==null || str.length()<=1)
		{
			System.out.print(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}

}
