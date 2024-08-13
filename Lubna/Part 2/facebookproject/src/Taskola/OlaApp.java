package Taskola;

import java.util.Scanner;

import javax.security.sasl.AuthorizeCallback;
import javax.swing.plaf.basic.BasicTextUI.BasicHighlighter;

public class OlaApp {
	public static void main(String[] args) {
		Ola ola = new Ola();
	
		
		System.out.println("WELCOME TO OLA ");
		Scanner s = new Scanner(System.in);
		System.out.println("enter the option 1 for user 2 for driver");
		int opt = s.nextInt();
		
		if(opt==1)
		{
			User u =new User();
			System.out.println("enter the choice 1 for auto");
			System.out.println("enter the choice 2 for bike");
			System.out.println("enter the choice 3 for 3 for car ");
			int o =s.nextInt();
			
			switch(o)
			{
			case 1:
			{
				System.out.println("you have selected auto");
				ola.addAuto(new Auto());
				System.out.println("This is auto details ");
				ola.a.auto();
				System.out.println("Wait for auto");
			}
			break;
			case 2: 
	    	  {
	    		  System.out.println("You have selected Bike");
	    		  ola.addBike(new Bike());
	    		  System.out.println("This is bike details");
	    		  ola.b.bike();
	    		  System.out.println("wait for bike it coming");
	    		  
	    	  }
	    	  break ;
	    	  case 3:
	    	  {
	    		  System.out.println("You have selected Cab");
	    		  ola.addCab(new Cab());
	    		  System.out.println("This is cab details");
	    		  ola.c.cab();
	    		  System.out.println("wait for cab it coming");
	    		  
	    		  
	    	  }
	    	  break;
	    	  default :{
	    		  System.out.println("Invalid");
	    		  
	    	  }
	    	  }
	    	   
	      }else if(opt == 2) {
	    	  Driver d = new Driver();
	    	  System.out.println("Hi" + " " +d.name+ " we are connecting you with the user");
	    	  d.driver();
	    	  
	      }else {
	    	  System.out.println("Invalid");
	      }
	

	
	
}
				
				
	
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			break;
			}
			
			
	}

}
