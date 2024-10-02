package Assignment6;

public class Person {
	final String name;

	final int age;

	public Person() {

		super();

		this.name = "Praduny";

		this.age = 24;

	}

	public String getName() {

		return name;

	}

	public String setName(String name) {

		return name;

	}

	public int getAge() {

		return age;

	}

	public int setAge(int age) {

		return age;

	}

	public String toString() {

		return "Person [name=" + name + ", age=" + age + "]";

	}

	public static void main(String[] args) {

		Person person = new Person();

		System.out.println(person);

		person.getName();

		person.getAge();

		person.setName("Harish");

		person.setAge(25);

	}

}
