import java.util.HashMap;
import java.util.Map;

public final class ImmutableDemo {
	
	final int a=10;
	Map<String,String> map1=new HashMap<>();
	
	int getInstance()
	{
		return a;
	}
	
	Map getHashMap()
	{
		return Map.copyOf(map1);
	}

}
