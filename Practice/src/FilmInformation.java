
public class FilmInformation {
	
	String MovieName;
	String ReleaseYear;
	String HeroName;
	
	public FilmInformation(String MovieName,String ReleaseYear) {
		
		this.MovieName = MovieName;
		this.ReleaseYear = ReleaseYear;
	}
	
	
	public void PrintMovieInformation(String HeroName) {
		
		System.out.println("the movie name is "+this.MovieName+" and the release year is "+this.ReleaseYear + " and it is acted by " + HeroName);
	}
	
}
