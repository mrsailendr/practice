package lambda.test;

public class LambdaTest {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,3,4,5,5,5,5};
		output(arr);

	}

	private static void output(int[] arr) 
	{
		System.out.println("Hello world\n");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			if(i!=arr.length && arr[i]==arr[i+1])
			{
				System.out.println("\n");
			}
		}
	}

}
