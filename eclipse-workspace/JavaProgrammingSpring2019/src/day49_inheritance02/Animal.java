package day49_inheritance02;

public class Animal {
	private String type;

	public Animal() {
		System.out.println("Animal constructor");
		type = "undefined";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
