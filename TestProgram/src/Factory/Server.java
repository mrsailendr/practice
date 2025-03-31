package Factory;

public class Server extends Computer{
	
	private String ram;
	private String cpu;
	private String hdd;
	
	public Server(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}
	

}
