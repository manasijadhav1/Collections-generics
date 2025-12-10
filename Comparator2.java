import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Comparator2 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
            a.add(r.nextInt(1000));
        }
        Collections.sort(a,(i1, i2) ->

                {
                    return i1%10>i2%10?1:i1%10<i2%10?-1:0;
                }
        );

        for(int i:a){
            System.out.println(i);
        }
    }
}
