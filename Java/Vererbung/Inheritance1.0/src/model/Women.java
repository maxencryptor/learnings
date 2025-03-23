package model;

public class Women implements People {
    private String name; 




    public Women(String name) {
        this.name = name;
    }




    @Override
    public void speaking() {
       System.out.println("I am a women!");
    }




    @Override
    public void disability(boolean input) {
     
        System.out.println("I am disabled: " + input);
    }


    
}
