package officehours18_11june;

public class UberDriver implements Person {

	@Override
	public String getOccupation() {
		return "Uber driver";
	}

	@Override
	public String getIncome() {
		return "50K";
	}

	@Override
	public String getWork() {
		return "picking people up and dropping them off";
	}

}
