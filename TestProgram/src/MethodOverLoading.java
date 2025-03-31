

class Parent
{
	public void show()
	{
		System.out.println("Parent");
	}
}
public class MethodOverLoading extends Parent {
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Child");
	}

	public static void main(String[] arg)
	{
		Parent p1= new Parent();
		p1.show();
		MethodOverLoading c1= new MethodOverLoading();
		c1.show();
		
		Parent p2= new Parent();
		p2.show();
		
	}

}

