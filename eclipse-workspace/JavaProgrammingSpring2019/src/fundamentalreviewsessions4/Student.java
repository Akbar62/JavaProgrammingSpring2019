package fundamentalreviewsessions4;

public class Student extends Object {
	
	private String school;
	
	public Student(String school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "student at " + school;
		
	}
	
	

}
