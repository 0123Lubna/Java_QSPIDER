package inheritance;

public class Calculator extends Number {

	public void sum() {
		System.out.println(n1+n2);
		
	}
	public void sub() {
		System.out.println(n1-n2);
	}
	public void mul() {
		System.out.println(n1*n2);

	}
	public static void main(String[] args) {
		Calculator ref = new Calculator();
		ref.sum();
		ref.sub();
		ref.mul();
	}
	

}
