import java.io.IOException;
import java.util.PriorityQueue;

public class helloworld {
	
	int num=100;
	public void calc(int num)
	{
		this.num=num*10;
	}
	
	public void print()
	{
		System.out.println(num);
	}
	public static void main(String[] arg)
	{
		//helloworld h=new helloworld();
		//h.calc(3);
		//h.print();
		
		/*
		 * PriorityQueue<Integer> p=new PriorityQueue<>(); p.add(11); p.add(10);
		 * p.add(23); p.add(7); p.add(12); p.add(3);
		 * 
		 * while(p.isEmpty()==false) { System.out.printf("%d",p.remove());
		 * System.out.println(); }
		 */
		
Integer numa=0;
		
		incrementInteger(numa);
		
		numa=numa*2;
				System.out.println(numa);
		//simpleRecursion(10);
	}
	
	public static void simpleRecursion(int n)
	{
		
		  if(n>0) { System.out.println(n); simpleRecursion(n-1); }
		 
		
		
	}
	
	static void incrementInteger(int nump) {
		nump++;
		Integer numa=42	;
	}

}
