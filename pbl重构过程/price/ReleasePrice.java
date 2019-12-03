package price;
import movie.Movie;
import price.*;
public class ReleasePrice extends Price{

	public int getPriceCode() {
		return Movie.release;
	}

	public int getFrequentRentalPoint(int Days) {
  		 return (Days>1) ? 2 : 1;
   }
	public double getCharge(int Days) {
		// TODO Auto-generated method stub
		  return Days * 3;
	}
}
