package day39;

public class School {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Roman";
		student1.age = 25;
		student1.subject = "Java";

		System.out.println("Name: " + student1.name);
		System.out.println("Age: " + student1.age);
		System.out.println("Subject: " + student1.subject);

		Student student2 = new Student();
		System.out.println(student2.name);
		student2.name = "Cleetus";
		student2.age = 33;
		student2.subject = "Selenium";

		System.out.println("Name: " + student2.name);
		System.out.println("Age: " + student2.age);
		System.out.println("Subject: " + student2.subject);

	}

}
