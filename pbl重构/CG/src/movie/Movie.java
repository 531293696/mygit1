package movie;

import price.*;

public class Movie {
public static final int childrens = 2;
public static final int regular = 0;
public static final int fresh = 1;

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
	case fresh:
	price = new FreshPrice();
			break;
	default:
			throw new IllegalArgumentException("Incorrect Price Code");
	
	}
}

}
