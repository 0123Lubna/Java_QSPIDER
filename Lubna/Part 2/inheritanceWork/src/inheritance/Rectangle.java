package inheritance;

import java.awt.geom.Area;

public class Rectangle extends Mes{
	
	public void area() {
		System.out.println(l+w);
		
	}
	
	public void peri() {
		System.out.println(2*(l+w));
		
	}
	public static void main(String[] args) {
		   Rectangle ref=new Rectangle();
		   ref.area();
		   ref.peri();
	}
	 
}


	
	


