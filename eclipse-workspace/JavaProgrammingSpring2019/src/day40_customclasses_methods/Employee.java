package day40_customclasses_methods;

public class Employee {
	public String name; // can be used anywhere in the project
	public String jobTitle;
	int salary; // can only be used in the same package

	public void work() {
		System.out.println(name + " is working hard");
	}

	public void attendMeeting() {
		System.out.println(name + " is attending a meeting");
	}

	public void introduce() {
		System.out.println("Name: " + name + "| Job title: " + jobTitle + "| Salary: " + salary);
	}

}
