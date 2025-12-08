import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AccessingCollectionElements {
    public static void main(String[] args) {
        Collection values=new ArrayList();
        values.add(4);
        values.add(50);
        values.add(82);
        values.add(700);

    //Iterator
        System.out.println("Using iterator");
        Iterator i=values.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    //Enhanced for loop
        System.out.println("Using enhanced for loop");
        for(Object a:values)
        {
            System.out.println(a);
        }

    }
}
