package price;
import movie.Movie;
import price.*;
public class ChildrensPrice extends Price{

	public int getPriceCode() {
		return Movie.childrens;
	}

	public double getCharge(int Days) {
		double result=1.5;
		if(Days > 3)
  			 result += (Days - 3) * 1.5;
		return result;
	}
}
