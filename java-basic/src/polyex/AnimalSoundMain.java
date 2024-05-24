package polyex;

public class AnimalSoundMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		soundAnimal(dog);
		soundAnimal(dog);
		soundAnimal(dog);
	}

	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
}
