package javaConstructor;


public class Book {
	public Book() {
		System.out.println("default constructor");
		
	}
	public Book(String title) {
		  System.out.println(title);
		
	}
	public Book(String title,String  Author) {
		System.out.println(title +"  ," +Author);
		
	}
	public Book(String title,String  Author,int year) {
		System.out.println(title+" ,"+Author +","+year);
		
	}
	public Book(String title,String  Author, int year ,int edition) {
		System.out.println(title+" ,"+Author +","+year+","+edition);
		
	}

	public static void main(String[] args) {
		Book a= new Book();
		Book b= new Book("the story of my life");
		Book c= new Book("the story of my life","Helen Keller");
		Book d= new Book("the story of my life","Helen Keller",1985);
		Book e= new Book("the story of my life","Helen Keller",1985,5);
		
	
//		System.out.println(a);//  object address printing 
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		

	}

}
