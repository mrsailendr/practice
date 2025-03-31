package Singleton;

public class EgarInitial {
	
	public static final EgarInitial instance=new EgarInitial();
	
	private EgarInitial()
	{
		
	}
	
	public static EgarInitial getInstance1()
	{
		return instance;
	}

	

	

}
