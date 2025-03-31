import java.math.BigInteger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BigProblem{
	
	public static final int END=Integer.MAX_VALUE;
	public static final int START=END-100;
	
	public static void main(String[]arg)
	{
		/*
		 * BigInteger bg=new BigInteger("5000"); BigInteger bg1=new BigInteger("50000");
		 * BigInteger bg2=new BigInteger("500000");
		 * 
		 * BigInteger total=BigInteger.ZERO; total.add(bg); total.add(bg1);
		 * total.add(bg2); //System.out.println(total);
		 * 
		 * final String pig="length: 10"; final String dog="Length:"+pig.length();
		 * System.out.println("Animal are equal"+pig==dog);
		 */
		
		/*
		 * int count=0; for(int i =START;i<=END;i++) count++;
		 * 
		 * System.out.println("HEllo"); System.out.println(count);
		 */
		
		
		Set s= new TreeSet();
		s.add(new  B());
		s.add(new  B());
		System.out.println(s.size());
		Iterator i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
			
	}
	
	 

}




  class B 
{
	public static void sound()
	{
		System.out.println("i");
	}
}
