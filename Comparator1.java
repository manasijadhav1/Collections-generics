import java.util.*;
class Comp implements Comparator<Integer>
{
   public int compare(Integer o1,Integer o2)
    {
        if(o1%10>o2%10)
        {
            return 1;
        }
        return -1;
    }


}
public class Comparator1 {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        values.add(109);
        values.add(453);
        values.add(501);
        values.add(908);
        values.add(302);

       Comparator<Integer> a=new Comp();


        //Using Ananomous class
        /*Comparator<Integer> a=new Comparator<Integer>()
        {
            public int compare(Integer o1,Integer o2)
            {
                if(o1%10>o2%10)
                {
                    return 1;
                }
                return -1;
            }
        };*/
        Collections.sort(values,a);

        Iterator i=values.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
