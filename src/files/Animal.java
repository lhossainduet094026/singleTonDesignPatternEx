package files;

public class Animal {
	private static Animal aAnimal = new Animal();

	private Animal() {

	}

	public static Animal getInstance() {
		return aAnimal;
	}

	public void show() {
		System.out.println("i am lion.");
	}
}
