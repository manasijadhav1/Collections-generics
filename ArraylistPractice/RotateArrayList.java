package ArraylistPractice;

import java.util.ArrayList;

public class RotateArrayList {
    static void reverse(ArrayList<Integer> a, int left, int right) {
        while (left < right) {
            int temp = a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);
            left++;
            right--;
        }
    }

    static void rotate(ArrayList<Integer> a, int k) {
        int n = a.size();
        k = k % n;
        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4); a.add(5);

        rotate(a, 2);

        System.out.println(a);
    }
}
