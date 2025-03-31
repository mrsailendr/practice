package rain;

import java.util.Collection;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class Rain {
	
	public static void main(String args[])
	{
		Map<String,Integer> map=new HashMap<>();

		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		map.put("key5", 5);
		map.put("key6", 6);

		Integer collect = map.values().stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(collect);
	}
}
