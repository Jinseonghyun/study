package generic.ex;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

	public static void main(String[] args) {
		Animal animal = new Animal("����", 0);
		Dog dog = new Dog("�۸���", 100);
		Cat cat = new Cat("�Ŀ���", 50);
		
		Box<Dog> dogBox = new Box<>();
		dogBox.setValue(dog);
		Dog findDog = dogBox.getValue();
		System.out.println("findFog = " + findDog);
		
		Box<Cat> catBox = new Box<>();
		catBox.setValue(cat);
		Cat findCat = catBox.getValue();
		System.out.println("findCat = " + findCat);
		
		Box<Animal> animalBox = new Box<>();
		animalBox.setValue(animal);
		Animal findAnimal = animalBox.getValue();
		System.out.println("findAnimal = " + findAnimal);
	}

}
