package Singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton()
	{
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance1()
	{
		if(instance==null)
			instance=new ThreadSafeSingleton();
		
		return instance;
	}

}
