package day65_collections02;
import java.util.*;

public class SortStudents{
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		stList.add(new Student(300, "Roman"));
		stList.add(new Student(87, "Ibrahim"));
		stList.add(new Student(89, "Burak"));
		stList.add(new Student(1, "Gulnar"));
		stList.add(new Student(10, "Anara"));
		stList.add(new Student(101, "Vlad"));
		
		System.out.println(stList.toString());
		
		Collections.sort(stList);
		
		System.out.println(stList.toString());
		
		String str1 = "w";
		String str2 = "b";
		
		System.out.println(str1.compareTo(str2));
		
		Student student1 = new Student(10, "Abiy");
		Student student2 = new Student(5, "Olena");
		
		System.out.println(student1.compareTo(student2));
	}
	

}
