package Singleton;

public class LazyInitialization {
	
	public static LazyInitialization instance;
	
	private LazyInitialization()
	{
		
	}

	public static LazyInitialization getInstance1()
	{
		if(instance==null)
			instance=new LazyInitialization();
		
		return instance;
		
	}
}
