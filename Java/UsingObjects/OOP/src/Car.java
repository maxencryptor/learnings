public class Car {

    private int topSpeed; 

    private String brand; 


    private int buildIn; 



    

    public Car(String brandName, int topSpeed, int buildIn) {

        this.brand = brandName; 

        if ((topSpeed > 0) && (topSpeed < 1500)) {
            this.topSpeed = topSpeed;
        } else {
            throw new ArithmeticException("not possible.");
        }


            if ((buildIn > 0) && (buildIn < 2025)) {
                this.buildIn = buildIn;
            } else {
                throw new ArithmeticException("Build has to be correct!");
            }






    }



    public int getTopSpeed() {
        return topSpeed;
    }


    public String getBrand() {
        return this.brand;
    }


    public int getBuildIn() {
        return this.buildIn;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public void setBuildIn(int buildIn) {
        this.buildIn = buildIn;
    }


    


}
