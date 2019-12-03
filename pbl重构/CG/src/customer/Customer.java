package customer;
import java.util.Enumeration;
import java.util.Vector;

import movie.*;
import rental.*;
import price.*;
public class Customer {
    private String _name;
    private Vector _rentals = new Vector() ;

    public Customer (String name){
      _name = name;
    };

    public void addRental(Rental arg){
      _rentals.addElement(arg);
    }

    public String getName(){
    return _name;
     };

public String statement() {
	

	Enumeration rentals1 = _rentals.elements();
	String result = "Rental Record for"+getName()+"\n";
			while(rentals1.hasMoreElements()) {
				
				Rental each = (Rental)rentals1.nextElement();
				
				result += "\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
				
			}
	result += "Amount owed is"+String.valueOf(getTotalCharge())+"\n";
	result += "You earned"+String.valueOf(getTotalFrequentRenterPoints())+"frequent renter points";
   return result;
}
private double amountFor(Rental aRental) {
	return aRental.getCharge();
}


private double getTotalCharge() {
	double result = 0;
	Enumeration rentals = _rentals.elements();

	while(rentals.hasMoreElements()) {
		
		Rental each = (Rental)rentals.nextElement();
		
		result += each.getCharge();
		
	}
	return result;
	
}

private int frequentRenterPointss(Rental rentals) {
	  return rentals.getFrequentRentalPoint();
}

private int getTotalFrequentRenterPoints() {
	int result = 0;
	Enumeration rentals = _rentals.elements();

			while(rentals.hasMoreElements()) {
				
				Rental each = (Rental)rentals.nextElement();
				
				result += frequentRenterPointss(each);
				
			}
			return result;
}
}



