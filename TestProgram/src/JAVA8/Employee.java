package JAVA8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
	
	
	int id;
	String name;
	double sal;
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void main(String[] arg)
	{
		List<Employee> employeeList= new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Amarjit", 25000f));
		employeeList.add(new Employee(1, "Naren", 35000f));
		employeeList.add(new Employee(1, "Mrutyunjay", 45000f));
		employeeList.add(new Employee(1, "Satya", 55000f));
		employeeList.add(new Employee(1, "Sachin", 75000f));
		employeeList.add(new Employee(1, "Adhish", 95000f));
		employeeList.add(new Employee(1, "Suman", 85000f));
		
		//HIghest sal
		Optional<Employee> emp=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSal)));
		System.out.println(emp.toString());
		
		//Second Highest
		
		Optional<Employee> secondndHighestEmp=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).skip(1).findFirst();
		System.out.println(secondndHighestEmp.get());								
		
		String name =employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).findFirst().get().getName();
		System.out.println(name);
		//System.out.println("Third Highets"+thirdHighest.get());
		
		Double  d= employeeList.stream().collect(Collectors.averagingDouble(e->e.getSal()));
		
		
		System.out.println("Average sal: "+ d);
		Optional<Employee> MinSalEmp=employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSal)));
		System.out.println("Min Sal: "+ MinSalEmp.get());
		
		
		
		
		double totalsal= employeeList.stream().collect(Collectors.summingDouble(e->e.sal));
		double averageSal=employeeList.stream().filter(e->e.sal>50000).collect(Collectors.averagingDouble(e->e.sal));
		
		
		System.out.println("Total sal:"+totalsal);
		System.out.println("Average sal:"+averageSal);
		
		
		String name1=employeeList.stream().filter(e->e.name.startsWith("S")).sorted(Comparator.comparingDouble(Employee::getSal).reversed()).findFirst().get().getName();
		System.out.println("Name: "+name1);
		
		String s=new String("Amarjit");
		String s1=new String("Amarjit");
		
		System.out.println(s1.equals(s));
		System.out.println(s1==s);
		
		String s2="Amarjit";
		String s3="Amarjit";
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}
	

}
