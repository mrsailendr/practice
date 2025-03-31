package memory;

public class Employee {

	int age;
	String name;

	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(15, "saila");
		Employee e2 = new Employee(15, "saila");
		System.out.println(e1);
		System.out.println(e1);
		System.out.println(e1.equals(e2));

	}

//	@Override
//	public int hashCode() {
//		return age;
//	}

	@Override
	public boolean equals(Object obj) {
		return this.age == ((Employee) obj).age;
	}
}
