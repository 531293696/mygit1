import customer.*;
import movie.*;
import rental.*;
import price.*;

public class Main {
     public static void main(String[] args) {
    	 Customer customer=new Customer("孟祥臣");
    	 customer.addRental(new Rental(new Movie("《小丑2019》",2),5));
    	 customer.addRental(new Rental(new Movie("《无双》",0),6));
    	 customer.addRental(new Rental(new Movie("《叶问3》",1),7));
    	 System.out.println("租用清单："+"\n"+customer.statement());
     }
}
