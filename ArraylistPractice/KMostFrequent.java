package ArraylistPractice;

import java.util.*;

public class KMostFrequent {
    static List<Integer> kMostFrequent(List<Integer> nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int x : nums)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && i < list.size(); i++)
            result.add(list.get(i).getKey());

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,1,2,2,3,3,3,3,4);
        System.out.println(kMostFrequent(nums, 2));
    }
}

