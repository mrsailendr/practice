package hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) 
    {
    	int lcm = lcm(a);
    	return lcm;
    }

	private static int lcm(List<Integer> a) {
		a.sort(Comparator.naturalOrder());
		if(a.get(0)>2)
		{
			int i=2;
			while(i<=a.get(0)/2)
			{
				if(divisible(a, i))
				{
					a.stream().map(e -> e/2);
				}
			}
		}
		return 0;
	}
	
	private static boolean divisible(List<Integer> a, int number)
	{
		return a.stream().filter(e -> e%number == 0).count() > 0;
	}

}

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
    	List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(-1);
		arr.add(-1);

		plusMinus(arr);
    }
    
    public static void plusMinus(List<Integer> arr) 
	{
		List<Integer> arr1 = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(-1);
		arr.add(-1);
		System.out.println(arr1);
	}
}
