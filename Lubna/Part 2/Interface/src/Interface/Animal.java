package Interface;

public class Animal {
	public void m1() {
		System.out.println("ANIMALS ARE BEAUTIFUL CREATURE");
		
	}
    
}

class Dog extends Animal{
@Override
public void m1() {
	super.m1();
	System.out.println("Dog Barks");

}
public static void main(String[] args) {
	Dog gDog = new Dog();
	Animal animal= new Animal();
	gDog.m1();
	animal.m1();
	
	
	
}
}