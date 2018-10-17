package rk.java8.interfaces;

interface SampleInterface1 {

//	default methods cannot override a method in Object class
//	default String toString() {
//		return "";
//	}

	default String toString(int input) {
		return "" + input;
	}
}

public class InterfaceInheritance2 implements SampleInterface1 {
	public static void main(String[] args) {
		InterfaceInheritance2 obj = new InterfaceInheritance2();
		System.out.println(obj.toString(10));
	}
}
