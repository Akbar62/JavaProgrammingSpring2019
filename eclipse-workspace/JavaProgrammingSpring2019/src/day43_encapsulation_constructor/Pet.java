package day43_encapsulation_constructor;

public class Pet {
	private String type;
	private String name;

	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public Pet() {
		System.out.println("No-args constructor");
	}

	public void speak() {
		switch (type.toLowerCase()) {
		case "cat":
			System.out.println("Meow");
			break;
		case "dog":
			System.out.println("gav gav");
			break;
		case "bird":
			System.out.println("chik chirik");
			break;
		case "goat":
			System.out.println("mhaa mhaaa");
			break;
		case "sheep":
			System.out.println("bhaaa bhaaa");
			break;
		case "rooster":
			System.out.println("u uruuuu uruuu");
			break;
		default:
			System.out.println("...");
		}
	}

	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
