import java.util.ArrayList;

import Customers.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        


        ArrayList<Supplier> supplierList = new ArrayList<>();

        supplierList.add(new DHL());
        supplierList.add(new UPS());
        supplierList.add(new Sedition());

        
        System.out.println("The Packet deliveries are: ");

        for (Supplier customer: supplierList) {
            customer.deliver();
        }
        
        


        //Theory Questions: 
        // What would be different if Supplier class wouldn't be abstract?
        // we could create an object of the class.
    }
}
