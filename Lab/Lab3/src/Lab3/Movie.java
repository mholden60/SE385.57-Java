import java.text.DecimalFormat;

public class Movie {

	private String movieName;
	private String mpaaRating;
	private int terrible1;
	private int bad2;
	private int ok3;
	private int good4;
	private int great5;
public float count = 0;
	public Movie() {
		movieName = "";
		terrible1 = 0;
		bad2 = 0;
		ok3 = 0;
		good4 = 0;
		great5 = 0;

	}

	public enum rating {
		G, PG, PG13, R;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String newMovieName) {
		this.movieName = newMovieName;
	}

	public int getTerrible1() {
		return terrible1;
	}

	public void setTerrible1(int terrible1) {
		this.terrible1 = terrible1 + 1;
count++;
	}

	public int getBad2() {
		return bad2;
	}

	public void setBad2(int bad2) {
		this.bad2 = bad2 + 2;
		count++;
	}

	public int getOk3() {
		return ok3;
	}

	public void setOk3(int ok3) {
		this.ok3 = ok3 + 3;
		count++;
	}

	public int getGood4() {
		return good4;
	}

	public void setGood4(int good4) {
		this.good4 = good4 + 4;
		count++;

	}

	public int getGreat5() {
		return great5;
	}

	public void setGreat5(int great5) {
		this.great5 = great5 + 5;
		count++;
	}

	public String getMpaaRating() {
		return mpaaRating;
	}

	public void setMpaaRating(String newMpaaRating) {
		this.mpaaRating = newMpaaRating;
	}

	public void addRating(int rate) {

		switch (rate) {
		case 1:
			setTerrible1(terrible1);

			break;
		case 2:
			setBad2(bad2);

			break;
		case 3:
			setOk3(ok3);

			break;
		case 4:
			setGood4(good4);

			break;
		case 5:
			setGreat5(great5);

			break;
		default:
			System.out.println("Rating cannot be less then 1 or greater then 5");
			System.exit(0);
		}
	}

	public double getAverage() {
		 
		float average = 0;
		average = (getTerrible1() + getBad2() + getOk3() + getGood4() + getGreat5()) / count;
		return average;

	}
}
