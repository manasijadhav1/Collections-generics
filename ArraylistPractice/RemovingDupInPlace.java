package ArraylistPractice;

import java.util.ArrayList;
import java.util.List;

public class RemovingDupInPlace {
    static void removingDuplicates(ArrayList<Integer> a)
    {
        for(int i=0;i<a.size();i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
                if(a.get(i).equals(a.get(j)))
                {
                    a.remove(j);
                    j--;
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>()
        {{
            add(30);
            add(40);
            add(40);
            add(50);
            add(50);
        }};

        removingDuplicates(a);
        System.out.println(a);

    }
}
