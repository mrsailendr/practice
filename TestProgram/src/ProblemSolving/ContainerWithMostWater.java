package ProblemSolving;

public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,4,3};
		int area=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				area=Math.max(area, Math.min(arr[i],arr[j])*(j-i));
			}
		}
		
		System.out.println("Area:"+area);
	}

}
