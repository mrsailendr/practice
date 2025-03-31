import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test111 {
	
		int data=50;
		
		void change(int data)
		{
			data=data+100;
		}
	
	
	public static void main(String[] args) {
		
		//LinkedHashMap<K, V> k=new LinkedHashMap<K, V>()
		List<String> list=Arrays.asList("1","2","3","1","2");
		
		Map<Object, Long> output=list.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
		System.out.println(output);
		
		System.out.println("a");
		try {
			System.out.println("b");
			
			throw new IllegalArgumentException();
		}
		catch(RuntimeException e)
		{
			System.out.println("c");
		}
		finally {
			System.out.println("d");
		}
		System.out.println("e");
		
		test111 t1=new test111();
		System.out.println(t1.data);
		t1.change(200);
		System.out.println(t1.data);
		
		char data[] = {'a', 'b', 'c'};
	    // String str = new String(data);
	 
	     String cde =  new String(data);
	     System.out.println("abc" + cde);
	     String c = "abc".substring(2,3);
	     String d = cde.substring(1, 2);

	 System.out.println("c" + c +"d"+ d);
	 Map<String,String> m=new HashMap<>();

	 m.put("nar","tys");
	 m.put("nar","tys");
	 m.put("na","tys");
	 m.put("esh","tys");
	 m.put("h","tys");

	 System.out.println(m.size());

	 
	}
	
	public int hashCode(){
	 	return 1;
	 }
	public boolean equals(Object o)
	 {
	 	return 1;
	 }

}
