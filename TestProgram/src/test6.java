import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test6 {
	public static void main(String[] args) {
		
		String s="helloworld";
		String[] arr= {"1","8","3","5"};
		
		List<Integer> inarr=Arrays.stream(arr).map(e->Integer.parseInt(e)).collect(Collectors.toList());
		
		System.out.println(inarr);
	}

}
