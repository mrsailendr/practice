import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//
public class java8 {
	
	
	List<Employee> emp=list.stream().filter(e->e.sal>=5000).map(e->e).collect(Collector.toList());
	
	public static void main(String[] arg)
	{
		int[] arr= {1,28,28,3,4,57,6};
		
		int secondhighest= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		
		System.out.println("Second Highest Numer"+secondhighest);
		
		//getSecondHighest(arr);
	}
	
	
}
