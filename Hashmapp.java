package Collectionss;

import java.util.HashMap;

public class Hashmapp {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        //Insertion
        h.put(1,"Manasi");
        h.put(2,"samiksha");
        h.put(3,"avi");
        System.out.println(h);
        System.out.println(h.containsKey(2));
        System.out.println(h.containsValue("ranjan"));
        System.out.println(h.get(2));
        h.put(3,"yashini");//overrides
        System.out.println(h);

        System.out.println(h.entrySet());
        System.out.println(h.keySet());
        System.out.println(h.values());




        //Iterating over a map
        for(Integer i:h.keySet())
        {
            System.out.println(i);
        }

        //Iterating over values
        for(String j:h.values())
        {
            System.out.println(j);
        }

        //Iterate over the key value mapping
        for(var e:h.entrySet())
        {
            System.out.println(e);
        }
        for(var e:h.entrySet())
        {
            System.out.println(e.getValue());
        }
        for(var e:h.entrySet())
        {
            System.out.println(e.getKey());
        }

    }
}
