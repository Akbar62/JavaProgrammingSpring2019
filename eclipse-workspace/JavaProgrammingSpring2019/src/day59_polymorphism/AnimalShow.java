package day59_polymorphism;

public class AnimalShow {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		// polymorphic way
		Animal tiger = new Tiger();
		Animal cheetah = new Cheetah();
		Animal zebra = new Zebra();
		
		animal.talk();
		tiger.talk();
		cheetah.talk();
		zebra.talk();
		
		Animal[] animals = new Animal[3];
		animals[0] = new Tiger();
		animals[1] = new Cheetah();
		animals[2] = new Zebra();
		
		animals[0].talk();
		animals[1].talk();
		animals[2].talk();
		
		
		
		
		
	}
}
