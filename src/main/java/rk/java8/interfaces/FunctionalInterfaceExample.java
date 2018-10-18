package rk.java8.interfaces;

@FunctionalInterface
interface FunctionalInterfaceExample {
	void greet();

//	Functional Interface cannot have multiple abstract methods.It should contain
//	only one abstract methods
// 	but it can have any number of default methods and static methods
//
//	void sayHello();
}
