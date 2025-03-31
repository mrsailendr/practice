import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapExample {
	
	public static void main(String[] arg)
	{
		Map<String,String> map=new HashMap<>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		map.put("key6", "value6");
		
		Set s= map.keySet();
		Iterator ir= s.iterator();
		while(ir.hasNext())
		{
			String key= (String) ir.next();
			
			System.out.println(map.get(key));
		}
		
		Set s2= map.entrySet();
		Iterator ir2 =s2.iterator();
		
		while(ir2.hasNext())
		{
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> map1= (Entry<String, String>) ir2.next();
			
			System.out.println(map1.getKey());
			System.out.println(map1.getValue());
		}
		
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(2);
		ls.add(6);
		ls.add(5);
		ls.add(7);
		ls.add(8);
		ls.add(9);
		ls.add(10);
		ls.add(1);
		ls.add(4);
		
		int total=ls.stream().filter(e->e%2==1).reduce(0, (a,b)->a+b);
		
	System.out.println("Total="+total);

			
		
		
	}
}
