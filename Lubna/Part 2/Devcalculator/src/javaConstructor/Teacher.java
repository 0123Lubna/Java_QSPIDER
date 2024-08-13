package javaConstructor;

public class Teacher {


	    public static void welcome() {
	        System.out.println("Welcome to the Java class!");
	    }
	    public void grade() {
	    	System.out.println("got an A +");
	    	
	    }
	    public void rollno() {
	    	System.out.println("My roll number is 2");
	    }
	    public void friend() {
	    	System.out.println("My friend name is Vikas");
	    }
	    
	    public static void teachSubject() {
	        System.out.println("Today's subject is Java.");
	    }

	    public static void motivationalQuote() {
	        System.out.println("Keep learning and growing!");
	    }
	    
	   
	   public static void main(String[] args) {
		   
	        welcome();
	        teachSubject();
	        motivationalQuote();
	        
	        Teacher teacher = new Teacher();
	        teacher.grade();
	        teacher.friend();
	        teacher.rollno();
	        
	        
	       
	    }
	}