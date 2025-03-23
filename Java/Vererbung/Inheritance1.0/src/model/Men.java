package model;

public class Men implements People{


    private String name; 



    public Men(String name) {
        this.name = name; 
    }


    @Override
    public void speaking() {
        System.out.println("Ich bin der Mann und speech!");
    }


    @Override
    public void disability(boolean I) {

        System.out.println("I am disabled: " + I);
    }
    
}
