package Factory;

public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getCPU();
	public abstract	String getHDD();
	@Override
	public String toString() {
		return "Computer [getRam()=" + this.getRam() + ", getCPU()=" + this.getCPU() + ", getHDD()=" + this.getHDD() + "]";
	}
	
	

}
