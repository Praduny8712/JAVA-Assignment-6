package Assignment6;

public class A {
	static void print() {
		System.out.println("Parent");
	}
}

class B extends A {
	static void print() {
		System.out.println("Child");
	}
}
