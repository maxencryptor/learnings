package model;

public class Child implements People {

    private String name;


    public Child(String name) {

        this.name = name; 
    }



    @Override
    public void speaking() {
        System.out.println("Here is speaking the Child!");


    }


    @Override
    public void disability(boolean I) {
        System.out.println("I am disable: " + I);
    }





    
}
