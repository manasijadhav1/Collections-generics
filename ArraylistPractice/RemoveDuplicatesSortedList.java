package ArraylistPractice;

import java.util.ArrayList;

public class RemoveDuplicatesSortedList {
    static void removingdupsorted(ArrayList<Integer> a)
    {   int j=0;
        for(int i=1;i<a.size();i++)
        {
            if(a.get(i).equals(a.get(j)))
            {
                a.remove(i);
                i--;
            }
            else
            {
                j++;
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>()
        {{
            add(30);
            add(40);
            add(42);
            add(50);
            add(50);
        }};
        removingdupsorted(a);
        System.out.println(a);

    }
}
