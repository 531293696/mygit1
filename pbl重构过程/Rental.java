package rental;
import movie.*;
public class Rental {
private Movie movie;
private int days;
public void Rental(Movie movie,int days) {
	movie = movie;
	days = days;
}
public int getDays() {
	return days;
}
public Movie getMovie() {
	return movie;
}
}
//添加amountFor函数
package rental;
import movie.*;
public class Rental {
private Movie movie;
private int days;
public void Rental(Movie movie,int days) {
	movie = movie;
	days = days;
}
public int getDays() {
	return days;
}
public Movie getMovie() {
	return movie;
}
}
double getCharge(){
double result = 0;
switch(getMovie().getPriceCode()){
       case Movie.regular:
        result +=2;
        if (getDays()>2)
             result += (getDays()-2)*1.5;
        break;
       case Movie.release:
        result +=getDays()*3;
        break;
       case Movie.childrens:
        result +=1.5;
        if (getDays()>3)
             result += (getDays()-3)*1.5;
        break;
}
      return result;
} 

//移除getCharge()函数到Movie中；
package rental;
import movie.*;
public class Rental {
private Movie movie;
private int days;
public void Rental(Movie movie,int days) {
	movie = movie;
	days = days;
}
public int getDays() {
	return days;
}
public Movie getMovie() {
	return movie;
}
}
double getCharge(){

      return movie.getCharge(Days);
} 

//常客积分计算
package rental;
import movie.*;
public class Rental {
private Movie movie;
private int days;
public void Rental(Movie movie,int days) {
	movie = movie;
	days = days;
}
public int getDays() {
	return days;
}
public Movie getMovie() {
	return movie;
}
}
double getCharge(){

      return movie.getCharge(Days);
} 
public int getFrequentRentalPoint() {
	return _movie.getFrequentRentalPoint(_Days);
	
}
}


//代码总成
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