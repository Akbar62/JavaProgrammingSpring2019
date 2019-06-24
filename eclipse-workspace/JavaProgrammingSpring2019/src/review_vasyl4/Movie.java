package review_vasyl4;

public abstract class Movie {
	private String rating;
	private int IdNumber;
	private String movieTitle;
	private Director director;

	public Movie(String rating, int idNumber, String movieTitle, Director director) {
		this.rating = rating;
		IdNumber = idNumber;
		this.movieTitle = movieTitle;
		this.director = director;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	public boolean equals(Movie m) {
		//Movie m = (Movie) o; // casting, if we will not cast
		return m.IdNumber == this.IdNumber;
	}
	
	public abstract double CalcLateFees(int numberOfDays);
	

}
