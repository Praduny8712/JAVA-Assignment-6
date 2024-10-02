package Assignment6;

public class MainAnimal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.move();
		System.out.println("========================================");
		Cat cat = new Cat();
		cat.sound();
		cat.move();
		System.out.println("========================================");
		Bird bird = new Bird();
		bird.sound();
		bird.move();

	}

}
