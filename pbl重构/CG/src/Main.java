import customer.*;
import movie.*;
import rental.*;
import price.*;

public class Main {
     public static void main(String[] args) {
    	 Customer customer=new Customer("java");
    	 customer.addRental(new Rental(new Movie("��java�������š�",2),5));
   
    	 System.out.println("�����嵥��"+"\n"+customer.statement());
     }
}
