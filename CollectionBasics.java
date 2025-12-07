import java.util.*;

public class CollectionBasics {
    public static void main(String[] args) {
        Collection a=new ArrayList();
        a.add(4);
        a.add(5.5);
        a.add("Manasi");
        for(Object o:a)
        {
            System.out.println(o);
        }
        //need of Generics-to ensure type safety
        //need of List-Collection cant keep tract of indexes so List(with some extra features) implements Collections
        List<Integer> p=new ArrayList<>();
        p.add(5);
        p.add(6);
        p.add(7);
        for(Integer o:p)
        {
            System.out.println(o);
        }
        //need of Set-avoids duplicates but do not preserve insertion order
        Set<Integer> q=new HashSet<>();
        q.add(5);
        q.add(6);
        q.add(7);
        for(Integer o:q)
        {
            System.out.println(o);
        }
        //treeset-returns input in sorted order
        Set<Integer> r=new TreeSet<>();
        r.add(9);
        r.add(6);
        r.add(7);
        for(Integer o:r)
        {
            System.out.println(o);
        }

    }
}
