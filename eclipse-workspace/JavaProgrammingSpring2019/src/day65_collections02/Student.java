package day65_collections02;

import java.util.*;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student anotherStudent) {

		if (this.id > anotherStudent.id) {
			return 1;
		} else if (this.id < anotherStudent.id) {
			return -1;
		}

		return 0;
	}

}
