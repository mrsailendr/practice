import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TestCommon {
	
	public static void main(String[] args) {
	       int[] arr1 = {1,2,3,1,3};
	       int[] arr2 = {3,5,4,1};
	       findCommonElement(arr1,arr2);
	       
	    }
	    
	/*
	 * static void findCommonElement(int[] arr1,int[] arr2) { Set<Integer> s1=new
	 * HashSet<Integer>(); for(int i=0;i<arr1.length;i++) { for(int
	 * j=0;j<arr2.length;j++) { if(arr1[i]==arr2[j])
	 * s1.add(Integer.valueOf(arr1[i])); } }
	 * 
	 * 
	 * System.out.println(s1);
	 * 
	 * }
	 * 
	 * 
	 */
	static void findCommonElement(int[] arr1,int[] arr2)
	{
		Set<Integer> s2=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			s2.add(Integer.valueOf(arr1[i])); 
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(s2.contains(arr2[i]))
					{
						System.out.println(arr2[i]);
					}
			
		}
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
	    System.out.println(ls);
		ls.stream();
		
	}
	
	
	
	
}
