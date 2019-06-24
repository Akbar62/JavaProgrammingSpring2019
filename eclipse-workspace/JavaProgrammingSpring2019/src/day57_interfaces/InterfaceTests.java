package day57_interfaces;

public class InterfaceTests {
	public static void main(String[] args) {
		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();
		
		t.charge();
		i8.charge();
		
		t.drive();
		t.selfDrive();
		
		Cat cat = new Cat();
		cat.KeepAsPet();
		cat.play();
		Pet.feed("fish food");
	}

}
