package main;

import java.util.ArrayList;

import model.*;


public class App {
    public static void main(String[] args) throws Exception {
       
        
        ArrayList<People> pList = new ArrayList<>();


        pList.add(new Child("maxjor"));
        pList.add(new Men("Papa"));
        pList.add(new Women("Marie"));



        for (People p : pList) {


            if (p instanceof Women) {
            p.disability(true);
            }
            else {
                p.speaking();
            }
        }




    }
}
