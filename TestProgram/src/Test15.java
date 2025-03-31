import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test15 {
	
	
	public static void main(String[] args) {
		
	
	
	int [] arr= {7,6,4,5,1,0};
	int [] arr2= {4,6,3,2};
	int [] arr3= {7,3,9,2};
	int [] arr4= {8,7,5,6,1};
	
	//output- common elements atleast 3 arrays
	
	Map<Integer,Integer> map1=new HashMap<Integer, Integer>();
	
	for(int i=0;i<arr.length;i++)
	{
		if(map1.containsKey(arr[i]))
		{
			int val=map1.get(arr[i]);
			map1.put(arr[i],val+1);
		}
		else
		{
			map1.put(arr[i], 1);
		}
	}
	
	//System.out.println(map1.toString());
	
	for(int j=0;j<arr2.length;j++)
	{
		if(map1.containsKey(arr2[j]))
		{
			int val=map1.get(arr2[j])+1;
			map1.put(arr2[j],val);
		}
		else
		{
			map1.put(arr2[j], 1);
		}
	}
	
	//System.out.println(map1.toString());
	
	for(int k=0;k<arr3.length;k++)
	{
		if(map1.containsKey(arr3[k]))
		{
			int val=map1.get(arr3[k])+1;
			map1.put(arr3[k],val);
		}
		else
		{
			map1.put(arr3[k], 1);
		}
	}
	
	//System.out.println(map1.toString());
	
	for(int l=0;l<arr4.length;l++)
	{
		if(map1.containsKey(arr4[l]))
		{
			int val=map1.get(arr4[l])+1;
			map1.put(arr4[l],val);
		}
		else
		{
			map1.put(arr4[l], 1);
		}
	}
			
	
	//System.out.println(map1.toString());
	Set keyset=map1.keySet();
	
	Iterator itr=keyset.iterator();

	while(itr.hasNext())
	{
		int key=(int) itr.next();
		
		if((map1.get(key))>=3)
		{
			System.out.println(key);
		}
	}
	
}
}
