package Assignment6;

abstract public class Animal {
	abstract void sound();

	abstract void move();
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("Sound is Bark");

	}

	@Override
	void move() {
		System.out.println("move is Runs");
	}
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("Sound is Meow");

	}

	@Override
	void move() {
		System.out.println("move is Walks");

	}

}

class Bird extends Animal {

	@Override
	void sound() {
		System.out.println("Sound is Chirp");

	}

	@Override
	void move() {
		System.out.println("move is Flies");

	}

}
