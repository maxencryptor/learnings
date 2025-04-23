import java.util.List;

public class Pair<T> {
    private T left; 
    private T right; 


    public Pair(T l, T r) {


        this.left = l;
        this.right = r;  
    }


    public T getLValue() {
        return this.left; 
    }


    public T getRValue() {
        return this.right; 
    }
    public void setLValue(T l) {
        this.left = l; 
    }


    public void setRValue(T r) {
        this.right = r; 
    }


    public static <T> T getFirst(List<T> list) {
        System.out.println(list.getFirst());
        return list.getFirst(); 
        
    }
}