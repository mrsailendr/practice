package memory;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list  =  new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		output(null);

	}

	private static void output(List<Integer> list) {
		System.out.println("Hello world\n");
		for (int i : list) {
			System.out.println(i);
//			if(i!=arr.length && arr[i]==arr[i+1])
//			{
//				System.out.println("\n");
//			}
		}
	}

}
