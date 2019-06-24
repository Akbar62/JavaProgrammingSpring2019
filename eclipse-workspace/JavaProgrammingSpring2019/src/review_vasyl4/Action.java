package review_vasyl4;

public class Action extends Movie {

	public Action(String rating, int idNumber, String movieTitle, Director director) {
		super(rating, idNumber, movieTitle, director);
	}

	@Override
	public double CalcLateFees(int numberOfDays) {
		return numberOfDays * 3;
	}

}
