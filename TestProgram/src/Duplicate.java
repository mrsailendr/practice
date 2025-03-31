import java.util.HashMap;
import java.util.Map;

public class Duplicate {
	
	public static void main(String[] arg)
	{
		String s="Java";
				
		checkDuplicate(s);
	

	}
	 static void checkDuplicate(String s) {
		// TODO Auto-generated method stub
		 
		 char[] arr=s.toCharArray();
		 Map<Character,Integer> map1= new HashMap<>();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(map1.containsKey(arr[i]))
			 {
				 map1.put(arr[i],map1.get(arr[i])+1);
			 }
			 else
			 {
				 map1.put(arr[i], 1);
			 }
		 }
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(map1.get(arr[i])>1)
			 {
				 System.out.println("Duplicate char is:"+ arr[i]);
			 		return;
			 }
		 }
				 
		
	}

}
