package rental;
import movie.*;
public class Rental{
    private Movie _movie;
    private int _Days;
    Rental price;


    public Rental(Movie movie, int Days){
     _movie = movie;
     _Days = Days;
    }

    public Movie getMovie(){
       return _movie;
     }
    
public double getCharge() {
    	
    		return _movie.getCharge(_Days);
    	}
public int getFrequentRentalPoint() {
	return _movie.getFrequentRentalPoint(_Days);
	
}
}