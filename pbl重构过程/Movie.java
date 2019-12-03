//初始代码
package movie;
import price.*;
public class Movie{
       public static final int childrens =2;
public static final int  regular = 0;
public static final int  release = 1;

private String _title;
private int _priceCode;

public Movie(String title,int priceCode){
      _title = title;
      _priceCode = priceCode;
}

public int getPriceCode(){
      return _priceCode;
}

public void setPriceCode(int arg){
      _priceCode = arg;
}

public String getTitle(){
      return _title;
};
}
//添加getCharge()函数
package movie;
import price.*;
public class Movie{
       public static final int childrens =2;
public static final int  regular = 0;
public static final int  release = 1;

private String _title;
private int _priceCode;

public Movie(String title,int priceCode){
      _title = title;
      _priceCode = priceCode;
}

public int getPriceCode(){
      return _priceCode;
}

public void setPriceCode(int arg){
      _priceCode = arg;
}

public String getTitle(){
      return _title;
}
double getCharge(int Days){
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
}
//常客积分计算
package movie;
import price.*;
public class Movie{
       public static final int childrens =2;
public static final int  regular = 0;
public static final int  release = 1;

private String _title;
private int _priceCode;

public Movie(String title,int priceCode){
      _title = title;
      _priceCode = priceCode;
}

public int getPriceCode(){
      return _priceCode;
}

public void setPriceCode(int arg){
      _priceCode = arg;
}

public String getTitle(){
      return _title;
}
public int getFrequentRentalPoint(int Days) {
	return price.getFrequentRentalPoint(Days);
}
double getCharge(int Days){
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
}


//代码总成
package movie;
import price.*;
public class Movie {
public static final int childrens = 2;
public static final int regular = 0;
public static final int release = 1;

private String _title;

private Price price;

public Movie(String title,int priceCode) {
	_title = title;
	setPriceCode(priceCode);
}

public double getCharge(int Days) {
	
		return price.getCharge(Days);
	}

public int getFrequentRentalPoint(int Days) {
	return price.getFrequentRentalPoint(Days);
}



public int getPriceCode() {
	return price.getPriceCode();
}
public String getTitle() {
	return _title;
}
public void setPriceCode(int arg) {
	switch (arg) {
	case regular:
	price = new RegularPrice();
			break;
	case childrens:
	price = new ChildrensPrice();
			break;
	case release:
	price = new releasePrice();
			break;
	default:
			throw new IllegalArgumentException("Incorrect Price Code");
	
	}
}

}
