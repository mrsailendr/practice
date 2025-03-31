
public class PallindrumDemo {
	
	public static void main(String[] args) {
		
		boolean result=checkPallindrum("malayalam");
		if(result)
		System.out.println("Pallindrum");
		else
			System.out.println("Not Pallindrum");
		
	}

	private static boolean checkPallindrum(String string) {
		// TODO Auto-generated method stub
		
		char[] arr= string.toCharArray();
		
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			if(arr[i]!=arr[j])
				return false;
		}
		
		return true;
		
	}

}
