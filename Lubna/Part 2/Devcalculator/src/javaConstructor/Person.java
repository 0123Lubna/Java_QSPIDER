package javaConstructor;


public class Person {
	public String name  ;
	public int age;
	public String address ;
	
	public Person(String name,int age , String address) {
		this.name =name;
		this.age =age;
		this.address= address;
		
		
	}

	public  void displayInfo() {
		System.out.println("Name : "+ name );
		System.out.println("Age : "+ age );
		System.out.println("Address : "+ address );
		
		
	}
	public static void main(String[] arg) {
		Person person1 = new Person("Ramit", 32, "Ashok nagar");
		Person person2 = new Person("Amit", 20, "vihar phase");
		Person person3 = new Person("Namit", 25, "Mayur vihar phase 2");
		
		System.out.println("Person 1 details : ");
		person1.displayInfo();
		System.out.println("Person 2 details : ");
		person2.displayInfo();
		System.out.println("Person 3 details : ");
		person3.displayInfo();
	}

	
		
	}
		
	

