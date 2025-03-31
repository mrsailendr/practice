import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
	
	
	public static void main(String arg[]) throws InterruptedException
	{
	
	PCDemo pc=new PCDemo();
	
	
	
	
	Thread  t1 =new  Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				pc.produce();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	});
	
	Thread t2= new Thread(new  Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				pc.consume();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	});
	
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	}
	
	
}


class PCDemo
{
	List<Integer> ls=new ArrayList<Integer>();
	int counter;
	int capacity=5;
	public void produce()
	{
		if(ls.size()<capacity)
		{
		ls.add(++counter);
		System.out.println("Produced "+ counter);
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else
			notify();
	}
	
	public void consume()
	{
		if(ls.size()==0)
		{
			notify();
		}
		else
		{
			int val=ls.remove(0);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Consumed"+val);
		}
		
	}
	
	
	
	
	
}
