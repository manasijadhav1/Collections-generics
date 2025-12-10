import java.util.*;
class Students
{
    int rollno;
    int marks;

    public Students(int rollno,int marks)
    {
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Roll: " + rollno + ", Marks: " + marks;
    }

}
public class ComparatorWithCustomType {
    public static void main(String[] args) {
        List<Students> s=new ArrayList<>();
        s.add(new Students(1,36));
        s.add(new Students(2,71));
        s.add(new Students(3,97));
        s.add(new Students(4,25));
        s.add(new Students(5,94));

        System.out.println(s);

    }
}
