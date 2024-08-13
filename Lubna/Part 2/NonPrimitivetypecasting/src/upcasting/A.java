package upcasting;

public class A extends Upcast{
	
	public static void main(String[] args) {
		Upcast n=new A();//Upcasting
		A a=(A) n;//Downcasting
		
		
		
		a.m2();
		
	}

	

}
