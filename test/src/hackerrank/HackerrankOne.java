package hackerrank;
import java.io.*;

import java.util.*;

class hackersample {

	public static void plusMinus(List<Integer> arr) {

		System.out.println(arr);

	}

}

public class HackerrankOne {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			int arrItem = Integer.parseInt(arrTemp[i]);

			arr.add(arrItem);

		}

		hackersample.plusMinus(arr);

		bufferedReader.close();

	}

}
