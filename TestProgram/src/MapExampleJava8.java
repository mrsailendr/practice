import java.util.HashMap;
import java.util.Map;

public class MapExampleJava8 {
	
	
	    public static void main(String[] args) {
	        System.out.println("Hello, World!"); 
	         Map<Integer, String> customers = new HashMap<Integer, String>();
			customers.put(1, "Jhon");
			customers.put(2, "Smith");
			customers.put(3, "Sally");
			System.out.println("");
			customers.entrySet().stream().forEach(e ->
					System.out.println("Key : " + e.getKey() + " value : " + e.getValue())
			);

		 
			
	    }
	}


