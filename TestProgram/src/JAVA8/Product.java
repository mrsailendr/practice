package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Product {
	
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	};
	
	public static void main(String[] arg)
	{
		List<Product> productList= new ArrayList<>();
		productList.add(new Product(1, "HP", 25000f));
		productList.add(new Product(2, "Dell", 30000f));
		productList.add(new Product(3, "Lenovo", 28000f));
		productList.add(new Product(4, "Sony", 28000f));
		productList.add(new Product(5, "Apple", 90000f));
		productList.add(new Product(5, "Apple", 90000f));
		//Filtering collection which is grater thatn 30000
		
		List<String> Mobile= Arrays.asList("Oppo","Vivo","Motorola","Apple","Oneplus","Oppo","Vivo","Apple","Apple");
		
		int[] arr= {1,2,12,4,5,10,-4,30};
		
		List<Product> productList1=productList.stream().filter(p->p.price>30000).map(p->p).collect(Collectors.toList());
		System.out.println(productList.toString());
		
		List<Float> productList2=productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(productList2);
		
		productList.stream().filter(p->p.price==28000).forEach(p->System.out.println(p.name));
		
		//sum using Reduce
		
		float total= productList.stream().map(Product::getPrice).reduce(0.0f,(sum,price)->sum+price);
		System.out.println("Total: "+total);
		
		
		//sum using collector method
		
		double total1=productList.stream().collect(Collectors.summingDouble(p->p.price));
		
		System.out.println("Total1 :"+total1);
		
		
		// Find MAX and MIN
		
		Product productMax= productList.stream().max((product1,product2)->product1.price> product2.price ?1:-1).get();
		
		System.out.println("MAX product is "+ productMax.price);
		
		
		Product productMin= productList.stream().min((product1,product2)->product1.price > product2.price?1:-1).get();
		
		System.out.println("MIN product is "+productMax.price);
		
		long count=productList.stream().count();
		
		System.out.println("Count="+count);
		
		
		long count1=productList.stream().filter(p->p.price>30000).count();
		
		System.out.println("Above 30000 count "+ count1);
		
		//Map<Integer,String> productMap=productList.stream().collect(Collectors.toMap(e->e.id, e->e.name));
		//System.out.println(productMap);
		Map<Product, Long> productMap1=productList.stream().collect(Collectors.groupingBy(Product->Product,Collectors.counting()));
		System.out.println(productMap1.entrySet());
		
		Map<String,Long> countMobile=Mobile.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		System.out.println(countMobile.entrySet());
		
		 Map<Boolean,List<String>> map1=Mobile.stream().collect(Collectors.partitioningBy(e->e.endsWith("a")));
		 
		 Long count2= Mobile.stream().count();
		 System.out.println("Count="+count2);
		 
		 
		 
		 System.out.println(map1);
		 
		int[] arr1= Arrays.stream(arr).map(a->a*a).sorted().toArray();
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));
		System.out.println(Long.valueOf(1));
		System.out.println(Long.valueOf(1));
		
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
