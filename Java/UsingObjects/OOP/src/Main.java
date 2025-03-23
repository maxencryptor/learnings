import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car = new Car("BMW", 210, 2011);







        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("BMW", 210, 2011));
        carList.add(new Car("Audi", 490, 2011));
        carList.add(new Car("VW", 180, 2015)); 
        
        for (int i = 0; i < carList.size() - 1; i++) {
            for (int j = i + 1; j < carList.size(); j++) {
                isFaster(carList.get(i), carList.get(j));
            }
        }
            
        }






    public static void isFaster(Car a, Car b) {


        if (a.getTopSpeed() > b.getTopSpeed()) {
            System.out.println("The " + a.getBrand() + " with an TopSpeed by " + a.getTopSpeed() + " is faster.");
        } else {
            System.out.println("The car " + b.getBrand() + " is faster than " + a.getBrand() + " we have an a TopSpeed at " + b.getTopSpeed());
        } 


    }
}
