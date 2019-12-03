import customer.*;
import movie.*;
import rental.*;
import price.*;

public class Main {
     public static void main(String[] args) {
    	 Customer customer=new Customer("java");
    	 customer.addRental(new Rental(new Movie("《java基础入门》",2),5));
   
    	 System.out.println("租用清单："+"\n"+customer.statement());
     }
}
