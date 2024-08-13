package Interface;



public interface upi {

	public static final int a=12;
	void m1();
	static void m2() {
		System.out.println("Lubna");
	
	}
	public static void main(String[] args) {
		m2();
		
	}
	
			
			
			
	
}

//100% abstraction achieve krne k liye we use interface ,we can change the design as per requirement 
//1abstract method interface me public hi hoga .likho ya nhi likho 
//in interface we can only have methods with public ,static final also initialized.
//
//2. we can remove public as it is present by default .
//3.we can also remove final as it is present by default .
//4. you can't skip value at initialization
//
//
//public , non static ,concrete we can't define inside interface
//if can define non static concrete method inside interface interface if it has default access modifier. 
//interface me constructor nhi hota .
//abstract class me hoga const7ructor	
//clonable???types of interface ."                         
