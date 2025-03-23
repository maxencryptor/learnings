package Customers;

public class UPS extends Supplier {


    @Override
    public void deliver(){
        System.out.println("UPS is delivering to you.");
    }
}
