package price;
import movie.Movie;

public class RegularPrice extends Price{

	public int getPriceCode() {
		return Movie.release;
	}

	public double getCharge(int Days) {
		double result=2;
 		 if(Days > 2) 
 			 result += (Days - 2) * 1.5;
		return result;
	}
}
