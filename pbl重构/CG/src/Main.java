import customer.*;
import movie.*;
import rental.*;
import price.*;

public class Main {
     public static void main(String[] args) {
    	 Customer customer=new Customer("���鳼");
    	 customer.addRental(new Rental(new Movie("��С��2019��",2),5));
    	 customer.addRental(new Rental(new Movie("����˫��",0),6));
    	 customer.addRental(new Rental(new Movie("��Ҷ��3��",1),7));
    	 System.out.println("�����嵥��"+"\n"+customer.statement());
     }
}
