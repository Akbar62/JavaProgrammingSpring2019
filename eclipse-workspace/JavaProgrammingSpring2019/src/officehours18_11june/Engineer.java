package officehours18_11june;

public class Engineer implements Person {

	@Override
	public String getOccupation() {
		
		return "test engineer";
	}

	@Override
	public String getIncome() {
		
		return "80K";
	}

	@Override
	public String getWork() {
		
		return "testing things for 8 hours a day and also some meetings";
	}

}
