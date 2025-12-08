import java.util.ArrayList;

class Container<T extends Number>
{
    T o;
    public T getValue()
    {
        return o;
    }
    public void setValue(T o)
    {
        this.o=o;
    }


    void show()
    {
        System.out.println(o.getClass().getName());
    }

    void demo(ArrayList<? super T> p)
    {

    }

}
public class GenericsBasics {
    public static void main(String[] args) {
        Container<Integer> obj=new Container<>();
        obj.setValue(9);
        obj.show();
        obj.demo(new ArrayList<Number>());
    }
}
