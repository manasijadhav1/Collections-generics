import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>
{
    int rollno;
    int marks;

    public Students(int rollno,int marks)
    {
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public String toString() //method of object class
    {
        return "Roll: " + rollno + ", Marks: " + marks;
    }

    public int compareTo(Students s)
    {
        return this.marks>s.marks?1:this.marks<s.marks?-1:0;
    }

}
public class Comparable {


    public class ComparatorWithCustomType {
        public static void main(String[] args) {
            List<Students> s=new ArrayList<>();
            s.add(new Students(1,36));
            s.add(new Students(2,71));
            s.add(new Students(3,97));
            s.add(new Students(4,25));
            s.add(new Students(5,94));

            Collections.sort(s);
            System.out.println(s);
        }
    }
}
