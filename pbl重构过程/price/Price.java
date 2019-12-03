package price;

import movie.Movie;

public abstract class Price{
	public abstract int getPriceCode();
	
	public abstract double getCharge(int Days);


	public int getFrequentRentalPoint(int Days) {
			return 1;
	}

}
	
