package day45_encapsulation_practice;

import java.util.*;

public class Course {
	private String name;
	private ArrayList<String> teachers = new ArrayList<>();
	private ArrayList<String> students = new ArrayList<>();

	public void addStudent(String studentName) {
		students.add(studentName);
	}
	
	public void addTeacher(String teacherName) {
		teachers.add(teacherName);
	}
	
	public void removeStudent(String studentName) {
		students.remove(studentName);
	}
	
	public void removeTeacher(String teacherName) {
		teachers.remove(teacherName);
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<String> teachers) {
		this.teachers = teachers;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}

}
