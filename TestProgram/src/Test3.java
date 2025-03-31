import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test3 {
	
	public static void main(String[] args) {
		
		int[] arr= {98,12,45,6,99};
		
		findSecondLargest(arr);
	}

	private static void findSecondLargest(int[] arr) {
		// TODO Auto-generated method stub
		int largest=arr[0];
		int secondlargest=arr[1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>secondlargest)
			{
				secondlargest=arr[i];
			}
		}
		
		System.out.println("SecondLargest="+secondlargest);
		
		
		/*How to find duplicate elements in a given integers list [10,15,8,49,25,98,98,32,15] in java using Stream functions?

				Input : [10,15,8,49,25,98,98,32,15]
				Output: [98, 15]*/
		
		List list=new ArrayList<>();
			list.add(10);
			list.add(15);
			list.add(8);
			list.add(49);
			list.add(25);
			list.add(98);
			list.add(98);
			list.add(32);
			Set<Integer> items = new HashSet<>();
			//List<Intger>=list.stream().filter(n->!items.add(n)).collect(Collectors.toSet());
				
				
        
						
		
		
		
	}

}
