package ArraylistPractice;

import java.util.ArrayList;

public class ReversingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>()
        {{
            add(30);
            add(40);
            add(60);
            add(50);
            add(80);
        }};
        reversedArrayList(a);
        System.out.println(a);
    }

    static void reversedArrayList(ArrayList<Integer> a)
    {
        int i=0;
        int j=a.size()-1;
        while(i<j)
        {
            int temp=a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        }
    }
}
