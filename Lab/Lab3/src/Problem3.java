import java.text.DecimalFormat;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie newMovie = new Movie();
		Movie newMovie2 = new Movie();
		Movie rate = new Movie();
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		newMovie.setMovieName("Gaurdians of the Galaxy, ");
		newMovie.addRating(1);
		newMovie.addRating(2);
		newMovie.addRating(3);
		newMovie.addRating(4);
		newMovie.addRating(5);
		newMovie.addRating(3);
		newMovie.addRating(1);
		
		System.out.print(newMovie.getMovieName());
		System.out.print( "Rated "+Movie.rating.G+"- ");
		System.out.println("Average rating: "+ numberFormat.format(newMovie.getAverage()));
		
		
		newMovie2.setMovieName("Rio 2, ");
		newMovie2.addRating(3);
		newMovie2.addRating(4);
		newMovie2.addRating(5);
		newMovie2.addRating(3);
		newMovie2.addRating(1);
		System.out.print(newMovie2.getMovieName());
		System.out.print( "Rated "+Movie.rating.PG13+"- ");
		System.out.println("Average rating: "+ numberFormat.format(newMovie2.getAverage()));
	}

}
