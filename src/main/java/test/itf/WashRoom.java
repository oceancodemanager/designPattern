package main.java.test.itf;

public class WashRoom {
	private void washAnimal(Animal animal) {
		if (animal.getClass().equals(Dog.class)) {
			System.out.println("dog 洗澡池");
		} else if (animal.getClass().equals(Cat.class)) {
			System.out.println("cat 洗澡池");
		}
		// animal.wash();
	}

	public static void main(String[] args) {
		WashRoom room = new WashRoom();
		Dog dog = new Dog();
		Cat cat = new Cat();
		room.washAnimal(dog);
		room.washAnimal(cat);
	}
}
