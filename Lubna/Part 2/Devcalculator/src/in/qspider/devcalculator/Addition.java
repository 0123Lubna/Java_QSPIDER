package in.qspider.devcalculator;

public class Addition {
	    
	  public static void add(int a, int b) {
		  System.out.println(a + b);
		  
		  
	  }
	   public void add(int x,int y,int z) {
		   System.out.println(x + y + z);
	
	}
	   public static void main(String[] args) {
			Addition.add(5, 8);// static      classname.membername
//			add(8, 6);//directly
//			Addition a = new Addition();
//			a.add(9, 3, 5);//obj ref. membername
//			System.out.println(a);
			Addition a = new Addition(); // non static
			//a.add(12,14,20);
			add(10,20);
			a.add(10,20,20 );
			

}
	   
}


