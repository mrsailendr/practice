import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.sun.tools.classfile.Opcode.Set;

public class OccuranceDemo {
	
	public static void main(String[] args) {
		
		
		int[]input= {1,2,3,4,4,3,2,1,1,5,6,1,2,6,6,6,6,5};

		//output- 6,1,2,3,4,5
		int [] output=printNumberOccurance(input);
		System.out.println(output);

	}

		static int[] printNumberOccurance(int [] arr)
		{
			Map<Integer,Integer> map1=new TreeMap<Integer,Integer>();
			
		
			
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
			
			
			System.out.println(map1);
			java.util.Set<Integer> s=map1.keySet();
			
			Iterator<Integer> itr= s.iterator();
			
			int[] output=new int[map1.size()];
			int j=0;
			
			//Map<Integer,Integer> map2=new TreeMap<Integer,Integer>();
			while(itr.hasNext())
			{
				int key= (int) itr.next();
				output[j++]=map1.get(key);
				System.out.println(map1.get(key));

			}
			
			
			Arrays.parallelSort(output);
			
			
			
			
			
			return output;
		}
	}


