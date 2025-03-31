
public class NumberShifting {
	
	public static void main(String[] arg)
	{
		
		int [] a= {1,2,3,4,5,78,9};
		
		//output-34512
		
		shiftingNumber(a,5);
	}	

	private static void shiftingNumber(int[] arr, int n) {
		// TODO Auto-generated method stub
			           
	        //Displays original array    
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }      
	            
	       for(int i=0;i<n;i++)
	       {
	    	   int last, j;
	    	   last=arr[arr.length-1];
	    	   
	    	   for(j=arr.length-1;j>0;j--)
	    	   {
	    		   arr[j]=arr[j-1];
	    	   }
	    	   
	    	   arr[0]=last;
	       }
	

	        System.out.println();    
            
	        //Displays resulting array after rotation    
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
}
}
