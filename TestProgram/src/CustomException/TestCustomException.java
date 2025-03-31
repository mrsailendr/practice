package CustomException;
import CustomException.InvalidAgeException;;


public class TestCustomException {
	
	 static void validateAge(int age) throws InvalidAgeException
	{
		if(age>18)
			System.out.println("Welcome to vote");
		else
			throw new InvalidAgeException("Not valid");
	}
	
	public static void main(String[] arg)
	{
		try
		{
		validateAge(23);
		validateAge(12);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
