package inheritance;

public class Sumsub extends Data {

	public void sum() {
		System.out.println(n1+n2);
	}
	public void sub() {
		System.out.println(n1-n2);
	}
	public static void main() {
		Sumsub ref=new Sumsub();
		ref.sub();
		ref.sum();
		
		
		}
}
