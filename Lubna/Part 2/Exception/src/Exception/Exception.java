package Exception;

public class Exception {

	public static void main(String[] args) {
		System.out.println("start");
		try {
		System.out.println(5/0);
		}
		catch (ArithmeticException e) {  // e is local reference variable 
			System.out.println(e.getMessage());
			//e.printStackTrace();//here we don't use system.out.println because it's return type  is void and we can print a void type .
		}
		
		}
}

