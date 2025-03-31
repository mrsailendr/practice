import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	public static void main(String[] arg)
	{
		List<String> days= new ArrayList<String>();
		days.add("Sunday");
		days.add("Tuesday");
		System.out.println(checkWeekDays(days));
	}

	 static boolean checkWeekDays(List<String> days) {
		// TODO Auto-generated method stub
		// enum e= {"Sunday"=1,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int [] count=new int[days.size()];
		int i=0;
		 for(String s:days)
		 {
 
			 switch(s)
			 {
			 case "Sunday":
				 count[i++]=1;
				 break;
			 case "Monday":
				 count[i++]=2;
				 break;
			 case "Tuesday":
				 count[i++]=3;
				 break;
			 case "Wedneday":
				 count[i++]=4;
				 break;
			 case "Thursday":
				 count[i++]=5;
				 break;
			 case "Friday":
				 count[i++]=6;
				 break;
			 case "Saturday":
				 count[i++]=7;
				 break;
			 
				 
			 }
		 }
		 
		 for(int k:count)
			 System.out.println(k);
		 
		 for(int j=0;i<count.length;j++)
		 {
			 if(j==0)
			 {
			 if(count[j]== (count[j+1]+1))
			 {
				 System.out.println(count[j]);
				 continue;
			 }
			 }
			 else if((count[j]==(count[j-1]-1)) && (count[j]==(count[j+1]+1))){
				 System.out.println("inside elese");
						 continue;
			 }
			 else
			 return false;
		 }
		 
		return true;
	}

}
