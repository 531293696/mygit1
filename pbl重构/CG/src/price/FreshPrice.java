package price;
import movie.Movie;
import price.*;
public class FreshPrice extends Price{

	public int getPriceCode() {
		return Movie.fresh;
	}

	public int getFrequentRentalPoint(int Days) {
  		 return (Days>1) ? 2 : 1;
   }
	@Override
	public double getCharge(int Days) {
		// TODO Auto-generated method stub
		  return Days * 3;
	}
}
