
public class test extends Thread{
	public void run()
	{
		System.out.println("Testing thread");
	}
	
	public static void main(String[] arg)
	{
		test t=new test();
		t.start();
	}
	
	try(test t =new test(); test t2=new test();)
	{
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
}
