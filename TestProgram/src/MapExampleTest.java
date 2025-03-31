import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExampleTest {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "x");
		map.put(2, "y");
		map.put(3, "x");
		map.put(4, "z");
		
		Map<String,List<Integer>> map1=map.forEach(Collectors.toMap());
		
		
	}

}
