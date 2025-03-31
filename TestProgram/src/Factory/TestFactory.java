package Factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		System.out.println(ComputerFactory.getComputer("Server", "2gb", "500gb", "dualcore").toString());

		System.out.println(ComputerFactory.getComputer("PC", "12gb", "1tb", "dualcore").toString());
	}

}
