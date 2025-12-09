import java.util.List;
import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        Vector<Integer> a=new Vector<>();
        System.out.println("Capacity Before:"+a.capacity());
        a.add(10);
        a.add(20);
        a.add(1,30);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println("capacity after:"+a.capacity());
        System.out.println(a.get(1));
        System.out.println(a.size());
        a.remove(1);
        System.out.println(a);
        System.out.println(a.contains(100));
    }
}
