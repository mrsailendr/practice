import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*2. WAP to Convert 2 d array to single string using Java streams.
int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
1 2 3
4 5 6
7 8 9*/
public class ArrayStream {
	
	public static void main(String[] arg)
	{
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[]arr= {1,2,3};
		
		IntStream stream = Arrays.stream(a).flatMapToInt(x -> Arrays.stream(x));
		
		 stream.forEach(str -> System.out.print(str + " "));

		
	}

}
