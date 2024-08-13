package Exception;

public class Array {
	


		public static void main(String[] args)
	    {
			
	        int ar[] = { 1, 2, 3, 4, 5 };
	        for (int i = 0; i <= ar.length; i++)
	        try {	
	            System.out.println(ar[i]);
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	        	System.out.println(e.getMessage());

			}
	    }
						
	}


