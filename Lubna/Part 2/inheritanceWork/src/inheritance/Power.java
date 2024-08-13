package inheritance;

public class Power extends Num{
	public void sqr() {
		System.out.println(5*5);
	}

	public void cube () {
		System.out.println(5*5*5);
	}
	public static void main() {
		Power r = new Power();
		r.sqr();
		r.cube();
		
		
	}
}
