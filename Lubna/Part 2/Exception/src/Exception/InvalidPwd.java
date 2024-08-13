package Exception;

public class InvalidPwd extends Exception{ 
			
	
			private String  getMessage() {
				return "Invalid password";
				

	}

			 public static void main(String[] args) {
			        
			            InvalidPwd e;
						System.out.println("Caught an exception: " + e.getMessage());
			        }
			    }
			