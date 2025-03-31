package Singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		EgarInitial e= EgarInitial.getInstance1();
		LazyInitialization l=LazyInitialization.getInstance1();
		ThreadSafeSingleton t=ThreadSafeSingleton.getInstance1();
		System.out.println(e);
		System.out.println(l);
		System.out.println(t);
	}
}
