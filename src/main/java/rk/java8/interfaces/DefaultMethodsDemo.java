package rk.java8.interfaces;

interface DefaultMethods {
	default public void greet() {
		System.out.println("Hello!");
	} 
}

public class DefaultMethodsDemo implements DefaultMethods{
	public static void main(String[] args) {
		DefaultMethodsDemo obj = new DefaultMethodsDemo();
		obj.greet();
	} 
}
	