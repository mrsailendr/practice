import java.util.HashMap;
import java.util.Map;

public class Test5 {
	
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<>();
		
		map.put("Abc", "123");
		map.put("def", "455");
		map.put("Abc", "123");
		map.put("xyz", "123");
		map.put("Abc", "123");
		map.put("Abc", "123");
		
		
		System.out.println(map.get("Abc"));
		
	}

}
