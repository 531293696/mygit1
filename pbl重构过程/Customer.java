//初始代码
package customer;
import java.util.Enumeration;
import java.util.Vector;

import movie.*;
import rental.*;
public class Customer {
private String name;
private Vector rentals = new Vector();
public Customer (String name) {
	this.name = name;
}
public void addRental(Rental arg) {
	rentals.addElement(arg);
}
public String getName() {
	return name;
}
public String statement() {
	double totalAmount = 0;
	int frequentRenterPoints = 0;
	Enumeration rentals1 = rentals.elements();
	String result = "Rental Record for"+getName()+"\n";
			while(rentals1.hasMoreElements()) {
				double thisAmount = 0;
				Rental each = (Rental)rentals1.nextElement();
				switch(each.getMovie().getPriceCode()) {
				case Movie.regular:
					thisAmount += 2;
					if(each.getDays()>2) 
						thisAmount += (each.getDays()-2)*1.5;
					break;
				case Movie.childrens:
					thisAmount += 1.5;
					if(each.getDays()>3) 
						thisAmount += (each.getDays()-3)*1.5;
					break;
				case Movie.release:
						thisAmount += each.getDays()*3;
					break;
				}
				frequentRenterPoints++;
				if((each.getMovie().getPriceCode() == Movie.release)&&each.getDays()>1)
					frequentRenterPoints++;
				result += "\t"+each.getMovie().getTitle()+"\t"+String.valueOf(thisAmount)+"\n";
				totalAmount += thisAmount;
			}
	result += "Amount owed is"+String.valueOf(totalAmount)+"\n";
	result += "You earned"+String.valueOf(frequentRenterPoints)+"frequent renter points";
    return result;
}
}

//添加amountFor函数



package customer;
import java.util.Enumeration;
import java.util.Vector;

import movie.*;
import rental.*;
public class Customer {
private String name;
private Vector rentals = new Vector();
public Customer (String name) {
	this.name = name;
}
public void addRental(Rental arg) {
	rentals.addElement(arg);
}
public String getName() {
	return name;
}
public String statement() {
	double totalAmount = 0;
	int frequentRenterPoints = 0;
	Enumeration rentals1 = rentals.elements();
	String result = "Rental Record for"+getName()+"\n";
			while(rentals1.hasMoreElements()) {
				double thisAmount = 0;
				Rental each = (Rental)rentals1.nextElement();
				switch(each.getMovie().getPriceCode()) {
				case Movie.regular:
					thisAmount += 2;
					if(each.getDays()>2) 
						thisAmount += (each.getDays()-2)*1.5;
					break;
				case Movie.childrens:
					thisAmount += 1.5;
					if(each.getDays()>3) 
						thisAmount += (each.getDays()-3)*1.5;
					break;
				case Movie.release:
						thisAmount += each.getDays()*3;
					break;
				}
				frequentRenterPoints++;
				if((each.getMovie().getPriceCode() == Movie.release)&&each.getDays()>1)
					frequentRenterPoints++;
				result += "\t"+each.getMovie().getTitle()+"\t"+String.valueOf(thisAmount)+"\n";
				totalAmount += thisAmount;
			}
	result += "Amount owed is"+String.valueOf(totalAmount)+"\n";
	result += "You earned"+String.valueOf(frequentRenterPoints)+"frequent renter points";
    return result;
}
private double amountFor(Rental aRental){
double result = 0;
switch(aRental.getMovie().getPriceCode()){
       case Movie.regular:
        result +=2;
        if (aRental.getDays()>2)
             result += (aRental.getDays()-2)*1.5;
        break;
       case Movie.release:
        result +=aRental.getDays()*3;
        break;
       case Movie.childrens:
        result +=1.5;
        if (getDays()>3)
             result += (aRental.getDays()-3)*1.5;
        break;
}
         return result；
}
}
//更改amountFor函数
package customer;
import java.util.Enumeration;
import java.util.Vector;

import movie.*;
import rental.*;
public class Customer {
private String name;
private Vector rentals = new Vector();
public Customer (String name) {
	this.name = name;
}
public void addRental(Rental arg) {
	rentals.addElement(arg);
}
public String getName() {
	return name;
}
public String statement() {
	double totalAmount = 0;
	int frequentRenterPoints = 0;
	Enumeration rentals1 = rentals.elements();
	String result = "Rental Record for"+getName()+"\n";
			while(rentals1.hasMoreElements()) {
				double thisAmount = 0;
				Rental each = (Rental)rentals1.nextElement();
				switch(each.getMovie().getPriceCode()) {
				case Movie.regular:
					thisAmount += 2;
					if(each.getDays()>2) 
						thisAmount += (each.getDays()-2)*1.5;
					break;
				case Movie.childrens:
					thisAmount += 1.5;
					if(each.getDays()>3) 
						thisAmount += (each.getDays()-3)*1.5;
					break;
				case Movie.release:
						thisAmount += each.getDays()*3;
					break;
				}
				frequentRenterPoints++;
				if((each.getMovie().getPriceCode() == Movie.release)&&each.getDays()>1)
					frequentRenterPoints++;
				result += "\t"+each.getMovie().getTitle()+"\t"+String.valueOf(thisAmount)+"\n";
				totalAmount += thisAmount;
			}
	result += "Amount owed is"+String.valueOf(totalAmount)+"\n";
	result += "You earned"+String.valueOf(frequentRenterPoints)+"frequent renter points";
    return result;
}
private double amountFor(Rental aRental){

        return aRental.getCharge()；
}
}

//代码总成


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



