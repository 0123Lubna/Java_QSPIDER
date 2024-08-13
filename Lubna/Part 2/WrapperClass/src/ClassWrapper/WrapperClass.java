package ClassWrapper;

public class WrapperClass {
	
	public static void main(String[] args) {//auto boxing example 
		Byte i=8;
		Integer q = 10;
		Short f= 55;
		Double d = 80521975.0d;
		Float w = 19.7f;
		Boolean bool = true;
		
		System.out.println(i);
		System.out.println(q);
		System.out.println(f);
		System.out.println(d);
		System.out.println(w);
		System.out.println(bool);
		
	//Byte b= new Byte(5);explicity 
		//boxing provides security 
//Integer i = 60;//implicitly 
	}

}
