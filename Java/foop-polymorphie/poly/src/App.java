import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pair<ArrayList<String>> p = new Pair<>(new ArrayList<>(List.of("Hey", "Maxjor")), new ArrayList<>(List.of("Okay", "Bye"))); 


        System.out.println(p.getLValue() + " " + p.getRValue());


        Pair<Integer> pi = new Pair<Integer>(2, 6);

        Pair.getFirst(new ArrayList<>(List.of("m", "a", "x")));

        List<Object> oList = new ArrayList<String>();

        


        



    }
}
