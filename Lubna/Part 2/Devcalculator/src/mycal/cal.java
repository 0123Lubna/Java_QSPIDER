package mycal;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner8;

import  in.qspider.devcalculator.Addition;
import  in.qspider.devcalculator.division.division;
import in.qspider.devcalculator.extract.uppercase;
import  in.qspider.devcalculator.Product.Product;
import  in.qspider.devcalculator.subtraction.*;

public class cal {

	public static void main(String[] args) {
//		Addition.add(5, 9);
//		
//		division.div(9, 5);
//		Product.product(5, 7);
//		
//		Addition mysum = new Addition();
//		
//		
//		Subtraction a = new Subtraction();
//		mysum.add(7, 5, 5);
//	    division.div(9, 5);
//	    Product.product(5, 7);
//	    a.subtract(9, 5);//since it is non static thats why we have created an object ,can take a variable to store and then calling it by its name.
//	  
		Scanner sc= new Scanner(System.in);
		
		
	    System.out.println("Enter 1 for addition: ");
	    System.out.println("Enter 2 for Subtraction: ");
	    System.out.println("Enter 3 for Division: ");
	    System.out.println("Enter 4 for Product: ");
	    System.out.println("Enter 5 for Upper and Lower Character: ");
	    
	    
		   int opt=sc.nextInt();
	  
	   switch (opt) {
	case 1: {
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		System.out.println("Enter a number ");
		int num2=sc.nextInt();
		System.out.println("Enter a number ");
		int num3=sc.nextInt();
		
		Addition rf=new Addition();
	
	    Addition.add(num,num2);
	    
	    rf.add(num, num2, num3);
		
	    break;
	}
	case 2:{
		System.out.println("Enter first number ");
		int num=sc.nextInt();
		System.out.println("Enter second number ");
		int num2=sc.nextInt();
		
		Subtraction nm1= new Subtraction();
	    nm1.subtract(num, num2);
	    break;
	}
	case 3:{
		System.out.println("Enter first number ");
		int num=sc.nextInt();
		System.out.println("Enter second number ");
		int num2=sc.nextInt();
		
		division.div(num, num2);
	    break;
	}
	   case 4:{
		   System.out.println("Enter first number ");
			int num2=sc.nextInt();
			System.out.println("Enter second number ");
			int num3=sc.nextInt();
			
			Product.pro(num2, num3);
			   
			   break;
	   }
	   case 5:{
		   System.out.println(" Enter a character ");
		   char ab = sc.next().charAt(0);
		   uppercase fg = new uppercase();
		 
		uppercase.getLower(ab);
		   fg.uppervowel(ab);
		
		   
	   }
	   
			   
		   
		
	
	default:
	{
		 System.out.println("Invalid Choice........");
	}
	}
	   
	   
	   
	}

}
