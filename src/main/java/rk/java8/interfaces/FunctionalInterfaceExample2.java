package rk.java8.interfaces;

@FunctionalInterface
interface SampleFunctionalInterface {
	void greet();
}

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {
		
		//implementation for functional interface through anonymous inner class
		SampleFunctionalInterface obj = new SampleFunctionalInterface() {
			@Override
			public void greet() {
				System.out.println("hai");

			}
		};
		obj.greet();
		
		//implementation functional interface through lambda expressions(single line lambda expression)
		SampleFunctionalInterface obj1 = () -> System.out.println("hello");
		obj1.greet();

		//implementation  functional interface through lambda expression (multi-line lambda expression)
		SampleFunctionalInterface obj2 = () -> {
			String city = "Chennai";
			System.out.println("hello " + city);
		};
		obj2.greet();
				
	}
}
