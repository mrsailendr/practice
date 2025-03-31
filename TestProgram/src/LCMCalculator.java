
public class LCMCalculator {
	
	public static void main(String[] arg)
	{
		
		System.out.println("LCM="+calculateLCM(5,12));
	}

	private static int calculateLCM(int a, int b) {
		// TODO Auto-generated method stub
		int max,step,lcm=0;
		
		if(a>b)
			max=step=a;
		else
			max=step=b;
		
		while(a!=b)
		{
			if(max%a==0 && max%b==0)
			{
				lcm=max;
				break;
			}
			
			max=max+step;
		}
		
		return lcm;
	}

}
