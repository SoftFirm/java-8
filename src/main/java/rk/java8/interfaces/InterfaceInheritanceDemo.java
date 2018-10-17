package rk.java8.interfaces;

interface Interface1 {
	void greetWithName(String name);

	default void greet() {
		System.out.println("Hello!");
	}
}

interface Interface2 {
	void greetWithName(String name);

	default void greet() {
		System.out.println("Hello!");
	}
}

//duplicate default methods should be overrided in the implementing class
//otherwise compiler will throw error
public class InterfaceInheritanceDemo implements Interface1, Interface2 {

	@Override
	public void greetWithName(String name) {
		System.out.println("Hello " + name);
	}

	@Override
	public void greet() {
		// Interface1.super.greet();
		System.out.println("overrided greetings");
	}
	
	public static void main(String[] args) {
		InterfaceInheritanceDemo obj = new InterfaceInheritanceDemo();
		obj.greet();
		obj.greetWithName("Karthik");
	}

}